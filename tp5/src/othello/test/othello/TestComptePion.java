package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class  TestComptePion{

    @Test
    public void compteOk(){
    Player j1 = new Player(Color.NOIR);
    Player j2 = new Player(Color.BLANCHE);
    OthelloGame game=new OthelloGame(j1,j2);
    assertEquals(2,game.compteColor(Color.BLANCHE));
    assertEquals(2,game.compteColor(Color.NOIR));

    }
    

}