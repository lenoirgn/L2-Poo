package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestChangePlayer{

    @Test
    public void testchangePlayer(){
        Player j1=new Player(Color.NOIR);
        Player j2=new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        game.switchPlayer();
        assertEquals(j2,game.getCurrentPlayer());
    }
}