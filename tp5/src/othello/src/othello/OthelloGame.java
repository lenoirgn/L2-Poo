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
        this.currentPlayer = player1;
        this.board = new Board(8, 8);
        this.gameOver = false;
    }
    public Player getCurrentPlayer(){
        return this.currentPlayer;

    }
    public Board getBoard(){
        return this.board;
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

    public boolean canPlayAt(Position posi,Player j){
        for (Direction dir: Direction.values()){
            if (encadreDansDirection(j, posi, dir)){
                return true;
            }
            
        }
        return false;

    }
    public void PoserPionPosition(Player j,Position  posi){
        Pion pion=new Pion(j.getColor());
        this.board.getboard()[posi.getLigne()][posi.getColonne()] = pion;
    }
    


}