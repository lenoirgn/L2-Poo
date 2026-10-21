package othello;
import othello.utils.*;
public class Board{
    /**
     * Constructs a new Board with the specified dimensions.
     * @param longueur the length of the board
     * @param largeur the width of the board
     */
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
    /**
     * Places a Pion on the board at the specified position.
     * @param p the Pion to be placed
     * @param pos the position where the Pion should be placed
     * @throws InvalidPositionException if the position is invalid or already occupied
     */
    // Pas utiliser
    public void poserPion(Pion p, Position pos) throws InvalidPositionException {
            if ( this.estValidePosition(pos) && this.estVide(pos) ){
                this.board[pos.getLigne()][pos.getColonne()] = p;
            }else{
                throw new InvalidPositionException();
            }
        
    }
    /**
     * Removes a Pion from the board at the specified position.
     * @param pos the position from which the Pion should be removed
     * @throws InvalidPositionException if the position is invalid
     */
    // Pas utiliser 
    public void retirerPion(Position pos){
        try {
            this.board[pos.getLigne()][pos.getColonne()] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidPositionException();
        }
    }
    /**
     * Checks if the specified position on the board is empty.
     * @param pos the position to check
     * @return true if the position is empty, false otherwise
     */
    public boolean estVide(Position pos){
        return this.board[pos.getLigne()][pos.getColonne()]==null;
    }
    /**
     * Gets the Pion at the specified position on the board.
     * @param pos the position from which to get the Pion
     * @return the Pion at the specified position, or null if the position is empty
     */
    public Pion getPion(Position pos){
        return this.board[pos.getLigne()][pos.getColonne()];
    }
    /**
     * Checks if the specified position is valid on the board.
     * @param posi the position to check
     * @return true if the position is valid, false otherwise
     */
    public boolean estValidePosition(Position posi){
        return this.longueur> posi.getLigne() && this.largeur>posi.getColonne() &&
               posi.getLigne()>=0 && posi.getColonne()>=0 ;
    }
    /**
     * Returns the length of the board.
     * @return the board .
     */
    public Pion[][] getboard(){
        return this.board;
    }

    public int getLongueur(){
        return this.longueur;
    }
    public int getLargueur(){
        return this.largeur;
    }
    public boolean isFull(){
        int longueur=this.getLongueur();
        int largeur= this.getLargueur();
        for (int i=0;i<longueur;i++){
            for (int j=0;j<largeur;j++){
                if ((this.board[i][j]==null)){
                    return false;
                }
            }
        }
        return true;

    }

}