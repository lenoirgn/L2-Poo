package othello;
import othello.utils.*;

public class OthelloGame{
    
    private Board board;         
    private Player  player1 ;
    private Player  player2 ; 
    private Player currentPlayer;
    private boolean gameOver;
    /**
     * Constructs a new OthelloGame with the specified players.
     * @param player1 the first player
     * @param player2 the second player
     */
    public OthelloGame(Player  player1,Player  player2){
        
        this.player1= player1;
        this.player2=player2;
        this.currentPlayer = player1;
        this.board = new Board(8, 8);
        this.gameOver = false;
    }
    /**
     * Returns the current player of this OthelloGame.
     * @return the current player
     */
    public Player getCurrentPlayer(){
        return this.currentPlayer;

    }
    /**
     * Returns the board of this OthelloGame.
     * @return the board of the game
     */
    public Board getBoard(){
        return this.board;
    }

    public void gameOver(){
        // imcomplete!! il manque une 2eme condition
        if (this.getBoard().isFull()){
            this.gameOver=true;
        }
    }
    /**
     * Switches the current player.
     * If the current player is player 1, player 2 becomes the current player;
     * otherwise, player 1 becomes the current player.
     */
    public void switchPlayer(){
        if (this.currentPlayer.equals(this.player1)){
            this.currentPlayer=this.player2;
        }else{
            this.currentPlayer=this.player1;
        }
    }

    
    /**
     * Checks if the current player can enclose pions in the specified direction.
     * @param j the player whose turn it is
     * @param posi the position to check
     * @param dir the direction to check
     * @return true if the player can enclose pions in the direction, false otherwise
     */
    public boolean encadreDansDirection(Player j,Position posi,Direction dir){

        if ((!this.board.estValidePosition(posi) || !this.board.estVide(posi))){
            return false;
        }

        Position posiVoisine=posi.neighbour(dir);
        
        if ((!this.board.estValidePosition(posiVoisine) || this.board.estVide(posiVoisine))){
            return false;
        }

        Pion pion=this.board.getPion(posiVoisine);
         
        if (pion.getCouleur() == j.getColor()) {
            return false;
        }

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
    /**
     * Checks if the current player can play at the specified position.
     * @param posi the position to check
     * @param j the player whose turn it is
     * @return true if the player can play at the position, false otherwise
     */
    public boolean canPlayAt(Position posi,Player j){
        for (Direction dir: Direction.values()){
            if (encadreDansDirection(j, posi, dir)){
                return true;
            }
            
        }
        return false;

    }
    /**
     * Places a Pion on the board at the specified position for the given player.
     * @param j the player whose Pion is to be placed
     * @param posi the position where the Pion should be placed
     */
    public void PoserPionPosition(Player j,Position  posi){
        Pion pion=new Pion(j.getColor());
        this.board.getboard()[posi.getLigne()][posi.getColonne()] = pion;
    }
    
    /**
     * Displays the current state of the game board.
     */
    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Position pos = new Position(i, j);
                Pion pion = this.board.getPion(pos);

                if (pion == null) {
                    System.out.print(". ");
                } else if (pion.getCouleur() == Color.NOIR) {
                    System.out.print("N ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }


}