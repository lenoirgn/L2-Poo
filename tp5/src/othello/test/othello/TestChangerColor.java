package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestChangerColor{

    @Test
    public void  changerColorEst(){
        
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();

        board.poserPion(new Pion(Color.NOIR), new Position(0, 0));
        board.poserPion(new Pion(Color.BLANCHE), new Position(0, 1));
        board.poserPion(new Pion(Color.BLANCHE), new Position(0, 2));
        board.poserPion(new Pion(Color.BLANCHE), new Position(0, 3));
        board.poserPion(new Pion(Color.NOIR), new Position(0, 4));

        // Change the color of the enclosed white pawns
        game.changeColor(Color.NOIR, new Position(0, 0), Direction.E);

        // Check that the white pawns have become black
        assertEquals(Color.NOIR, board.getPion(new Position(0, 1)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(0, 2)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(0, 3)).getCouleur());
    }

    
    @Test
    public void changerColorSud() {
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game = new OthelloGame(j1, j2);
        Board board = game.getBoard();

        board.poserPion(new Pion(Color.NOIR), new Position(0, 0));
        board.poserPion(new Pion(Color.BLANCHE), new Position(1, 0));
        board.poserPion(new Pion(Color.BLANCHE), new Position(2, 0));
        board.poserPion(new Pion(Color.BLANCHE), new Position(3, 0));
        board.poserPion(new Pion(Color.NOIR), new Position(4, 0));

        game.changeColor(Color.NOIR, new Position(0, 0), Direction.S);

        assertEquals(Color.NOIR, board.getPion(new Position(1, 0)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(2, 0)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(3, 0)).getCouleur());
    }

    @Test 
    public void changerColorSudEst() {
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game = new OthelloGame(j1, j2);
        Board board = game.getBoard();

        board.poserPion(new Pion(Color.NOIR), new Position(0, 0));
        board.poserPion(new Pion(Color.BLANCHE), new Position(1, 1));
        board.poserPion(new Pion(Color.BLANCHE), new Position(2, 2));
        board.poserPion(new Pion(Color.NOIR), new Position(5, 5));

        game.changeColor(Color.NOIR, new Position(0, 0), Direction.SE);

        assertEquals(Color.NOIR, board.getPion(new Position(1, 1)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(2, 2)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(3, 3)).getCouleur());
        assertEquals(Color.NOIR, board.getPion(new Position(4, 4)).getCouleur());

    }
    
        

}