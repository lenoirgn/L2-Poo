package othello;
import othello.utils.*;

public class OthelloGame{
    
    private Board board;         
    private Player  player1 ;
    private Player  player2 ; 
    private Player currentPlayer;
    private boolean gameOver;

    public OthelloGame(Player  player1,Player  player2){
        
        this.player1= player1;
        this.player2=player2;
    }
    public boolean encadreDansDirection(Player j,Position posi,Direction dir){

        if ((!this.board.estValidePosition(posi) || !this.board.estVide(posi))){
            return false;}

        Position posiVoisine=posi.neighbour(dir);
        
        if ((!this.board.estValidePosition(posiVoisine) || this.board.estVide(posiVoisine))){
            return false;}

        Pion pion=this.board.getPion(posiVoisine);
         
        if (pion.getCouleur() == j.getColor()) {
        return false;}

        posiVoisine=posiVoisine.neighbour(dir);

        while (this.board.estValidePosition(posiVoisine)) {
        if (this.board.estVide(posiVoisine)) {
            return false;
        }
        pion = this.board.getPion(posiVoisine);
        if (pion.getCouleur() == j.getColor()) {
            return true;
        }
        posiVoisine = posiVoisine.neighbour(dir);
     }
     return false;


    }
    


}