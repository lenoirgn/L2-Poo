package othello;
import java.util.Scanner;
import othello.utils.*;

public class OthelloMain{
  

  
    public static void main(String[] args) {
        Player player1=new Player(Color.NOIR);
        Player player2= new Player(Color.BLANCHE);
        OthelloGame game= new OthelloGame(player1,player2);
        Scanner saisie = new Scanner(System.in);

        while(!game.getGameOver()){
            System.out.println( game.getCurrentPlayer().toString() );
            System.out.print(" Donner la ligne : ? ");
            int x = saisie.nextInt();
            System.out.print(" Donner la colonne : ? ");
            int y = saisie.nextInt();
            Position posi=new Position(x,y);
            if (game.canPlayAt(posi, game.getCurrentPlayer())){
                game.changeAllColors(game.getCurrentPlayer(), posi);
                game.PoserPionPosition(game.getCurrentPlayer(), posi);
                }
            game.displayBoard();
            game.gameOver();
            game.switchPlayer();
          
        }
        int comptNoir=game.compteColor(Color.NOIR);
        int comptBlanche=game.compteColor(Color.BLANCHE);
        if(comptNoir>comptBlanche){
            System.out.println("Le vainqueur est :Noir" );
        }else{
            System.out.println("Le vainqueur est :Blanche" );
        }
        
        

    }
}