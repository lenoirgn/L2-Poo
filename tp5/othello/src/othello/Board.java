package othello;
import othello.utils.*;
public class Board{
    // le constructeur
    public Board(int longueur, int largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.board = new Pion [longueur][largeur];
    }
    // les attributs
    private int longueur;
    private int largeur;
    private Pion[][] board;


    // Les methodes
    public void poserPion(Pion p, Position pos) throws InvalidPositionException {
        try {
            if (this.estVide(pos)){
                this.board[pos.getLigne()][pos.getColonne()] = p;
            }else{
                throw new InvalidPositionException();
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidPositionException();
        }
    }

    public void retirerPion(Position pos){
        try {
            this.board[pos.getLigne()][pos.getColonne()] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidPositionException();
        }
    }
    public boolean estVide(Position pos){
        return this.board[pos.getLigne()][pos.getColonne()]==null;
    }
    public Pion getPion(Position pos){
        return this.board[pos.getLigne()][pos.getColonne()];
    }


}