package othello;
import othello.utils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTrouverDirection {

    @Test
    public void trouverDirectionOuest() {
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        

        assertEquals(Direction.W,
                game.trouverDirection(new Position(2, 3), new Position(2, 2)));
    }

    @Test
    public void trouverDirectionEst() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.E,
                game.trouverDirection(new Position(2, 3), new Position(2, 4)));
    }

    @Test
    public void trouverDirectionNord() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.N,
                game.trouverDirection(new Position(3, 2), new Position(2, 2)));
    }

    @Test
    public void trouverDirectionSud() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.S,
                game.trouverDirection(new Position(2, 2), new Position(3, 2)));
    }

    @Test
    public void trouverDirectionSudEst() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.SE,
                game.trouverDirection(new Position(2, 2), new Position(3, 3)));
    }

    @Test
    public void trouverDirectionNordEst() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.NE,
                game.trouverDirection(new Position(2, 2), new Position(1, 3)));
    }

    @Test
    public void trouverDirectionNordOuest() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.NW,
                game.trouverDirection(new Position(2, 2), new Position(1, 1)));
    }

    @Test
    public void trouverDirectionSudOuest() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertEquals(Direction.SW,
                game.trouverDirection(new Position(2, 2), new Position(3, 1)));
    }

    @Test
    public void trouverDirectionMemePosition() {
         Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);
        OthelloGame game=new OthelloGame(j1,j2);
        assertNull(game.trouverDirection(new Position(2, 2), new Position(2, 2)));
    }
}