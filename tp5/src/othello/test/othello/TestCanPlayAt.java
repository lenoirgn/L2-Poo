package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCanPlayAt{
    @Test
    public void  canPlayAtTrue(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        
        // 4. Créer la position (2, 3)
        Position posi = new Position(2, 3);
        assertTrue(game.canPlayAt(posi,j1));
    }
     @Test
    public void  canPlayAtFalse(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        
        // 4. Créer la position (5, 3)
        Position posi = new Position(5, 3);
        assertFalse(game.canPlayAt(posi,j1));
    }
    @Test
    public void  canPlayAtTruePosiValide(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        board.poserPion(new Pion(Color.NOIR), new Position(7, 2));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 4));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 5));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 6));
        
        // 4. Créer la position (5, 3)

        Position posi = new Position(7, 7);
        assertTrue(game.canPlayAt(posi,j1));
    }
    public void  canPlayAtFalsePosiValide(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 7));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 4));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 5));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 6));
        
        // 4. Créer la position (5, 3)

        Position posi = new Position(7, 2);
        assertFalse(game.canPlayAt(posi,j1));
    }
    public void  canPlayAtTruePosiValide2(){
        
        // 2. Créer les deux joueurs
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();
        board.poserPion(new Pion(Color.BLANCHE), new Position(6, 3));
        board.poserPion(new Pion(Color.NOIR), new Position(5, 4));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 7));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 4));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 5));
        board.poserPion(new Pion(Color.BLANCHE), new Position(7, 6));
        
        // 4. Créer la position (5, 3)

        Position posi = new Position(7, 2);
        assertFalse(game.canPlayAt(posi,j1));
    }
    
}