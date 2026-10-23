import othello.OthelloGame;
import othello.Board;
import othello.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class TestOverGame{
        @Test
    public void testGameOverBoardFull() {
       Player j1 = new Player(Color.NOIR);
       Player j2 = new Player(Color.BLANCHE);
       OthelloGame game = new OthelloGame(j1, j2);
       Board board = game.getBoard();
       
       Random random = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color couleur = random.nextBoolean() ? Color.NOIR : Color.BLANCHE;
                Position position= new Position(i,j);

                if (board.estValidePosition(position) && board.estVide(position) ){
                    board.poserPion(new Pion(couleur),position);
                }
                
                }
        }
        game.gameOver();
        assertTrue(game.getGameOver());
    }

     @Test
public void aucunJoueurPeutJouer() {
    Player j1 = new Player(Color.NOIR);
    Player j2 = new Player(Color.BLANCHE);
    OthelloGame game = new OthelloGame(j1, j2);

    Board board = game.getBoard();

    // Retirer les quatre pions initiaux
    board.getboard()[3][3] = null;
    board.getboard()[4][4] = null;

    // Placer quelques pions noirs
    board.getboard()[2][2] = new Pion(Color.NOIR);
    board.getboard()[2][3] = new Pion(Color.NOIR);
    board.getboard()[3][2] = new Pion(Color.NOIR);

    game.gameOver();
    assertTrue(game.getGameOver());
} 
}