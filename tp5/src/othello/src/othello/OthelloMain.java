package othello;
import othello.utils.*;

public class OthelloMain{

    public void start(){
        Player j1 = new Player(Color.NOIR);
        Player j2 = new Player(Color.BLANCHE);

        OthelloGame game=new OthelloGame(j1,j2);
        Board board=game.getBoard();

        // 3. Placer les quatre pions
        board.poserPion(new Pion(Color.BLANCHE), new Position(3, 3));
        board.poserPion(new Pion(Color.NOIR), new Position(3, 4));
        board.poserPion(new Pion(Color.NOIR), new Position(4, 3));
        board.poserPion(new Pion(Color.BLANCHE), new Position(4, 4));

    }
    public static void main(String[] args) {
        OthelloMain main = new OthelloMain();
        main.start();
        
        

    }
}