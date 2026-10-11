package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCanPlayAt{
    @Test
    public void  CanPlayeATTrue(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        // 3. Placer les quatre pions
        board.poserPion(new Pion(Color.BLANCHE), new Position(3, 3));
        board.poserPion(new Pion(Color.NOIR), new Position(3, 4));
        board.poserPion(new Pion(Color.NOIR), new Position(4, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(4, 4));

        // 4. Créer la position (2, 3)
        Position posi = new Position(2, 3);
        assertTrue(game.canPlayAt(posi,j1));
    }
     @Test
    public void  CanPlayeATFalse(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        
        board.poserPion(new Pion(Color.NOIR), new Position(3, 4));
        board.poserPion(new Pion(Color.NOIR), new Position(4, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(4, 4));

        // 4. Créer la position (2, 3)
        Position posi = new Position(2, 3);
        assertFalse(game.canPlayAt(posi,j1));
    }
    
}