import othello.OthelloGame;
import othello.Board;
import othello.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestChangeAllColor {

    @Test
public void testChangeAllColorsDeuxDirections() throws Exception {
    Player j1 = new Player(Color.NOIR);
    Player j2 = new Player(Color.BLANCHE);
    OthelloGame game = new OthelloGame(j1, j2);

    Board board = game.getBoard();

    // Vider le plateau
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            board.getboard()[i][j] = null;
        }
    }

    Position pos = new Position(2, 2);

    // Direction Est : blanc puis noir
    board.poserPion(new Pion(Color.BLANCHE), new Position(2, 3));
    board.poserPion(new Pion(Color.NOIR), new Position(2, 4));

    // Direction Sud : blanc puis noir
    board.poserPion(new Pion(Color.BLANCHE), new Position(3, 2));
    board.poserPion(new Pion(Color.NOIR), new Position(4, 2));

    // Changer les couleurs dans toutes les directions encadrées
    game.changeAllColors(j1, pos);

    // Vérifier que les deux pions blancs sont devenus noirs
    assertEquals(Color.NOIR,
            board.getPion(new Position(2, 3)).getCouleur());

    assertEquals(Color.NOIR,
            board.getPion(new Position(3, 2)).getCouleur());
}
}