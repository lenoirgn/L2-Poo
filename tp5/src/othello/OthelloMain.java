package othello;
import java.util.Scanner;
import othello.utils.*;

public class OthelloMain{
  

    
    // TODO : Gérer les coups invalides dans le main.
    // Si le joueur saisit une position invalide, lui redemander de jouer
    // sans changer de joueur. Changer de joueur uniquement après un coup valide.
    public static void main(String[] args) {
        Player player1=new Player(Color.NOIR);
        Player player2= new Player(Color.BLANCHE);
        OthelloGame game= new OthelloGame(player1,player2);
        Scanner saisie = new Scanner(System.in);

        while(!game.getGameOver()){
            System.out.println( game.getCurrentPlayer().toString() );
            System.out.print(" Donner la ligne : ? ");
            
            System.out.print("Donner la ligne : ");
            while (!OthelloGame.saisieEntier(saisie)) {
                System.out.println("Erreur : saisissez un entier.");
                saisie.next(); 
            }
            int x = saisie.nextInt();

            System.out.print("Donner la colonne : ");
            while (!OthelloGame.saisieEntier(saisie)) {
                System.out.println("Erreur : saisissez un entier.");
                saisie.next();
            }
            int y = saisie.nextInt();

            Position posi = new Position(x, y);

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