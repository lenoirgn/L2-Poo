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
    @Test
    public void poserPositionInValide(){
        Board board=new Board(4,4);
        Pion pion = new Pion(Color.NOIR);
        Position posi=new Position(5,2);
        assertThrows(InvalidPositionException.class, ()->board.poserPion(pion,posi));
    }
    @Test
    public void poserPositionInValideOcuuper(){
        Board board=new Board(4,4);
        Pion pion1 = new Pion(Color.NOIR);
        Position posi=new Position(3,3);
        board.poserPion(pion1,posi);
        Pion pion2 = new Pion(Color.NOIR);
         board.poserPion(pion2,posi);
        assertThrows(InvalidPositionException.class ,()->board.poserPion(pion2,posi));
    
    }

}