package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestPosePion{
    @Test
    public void poserPositionValide(){
        Board board=new Board(4,4);
        Pion pion = new Pion(Color.NOIR);
        Position posi=new Position(3,2);
        board.poserPion(pion,posi);
        assertEquals(pion,board.getPion(posi));
    }
}