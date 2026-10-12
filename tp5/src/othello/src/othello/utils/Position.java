package othello.utils;
public class Position{
   
    private int ligne;
    private int colonne;
    /**
     * Constructs a Position object with the specified row and column.
     * @param ligne the row of the position
     * @param colonne the column of the position
     */
    public Position(int ligne,int colonne){
    this.ligne=ligne;
    this.colonne=colonne;
   }
   /**
    * Returns the row of this Position.
    * @return the row of the position
    */
   public int getLigne(){
    return this.ligne;
   }
   /**
    * Returns the column of this Position.
    * @return the column of the position
    */
   public int getColonne(){
    return this.colonne;
   }

    
    /**
     * Returns a new Position object that is one step to the south-east of the current position.
     * @param pos the current position
     * @return a new Position object to the south-east of the current position
     */
    public Position sudEst(Position pos){
        return new Position(pos.getLigne()+1,pos.getColonne()+1);
    }
    /**
     * Returns a new Position object that is one step to the north of the current position.
     * @param pos the current position
     * @return a new Position object to the north of the current position
     */
    public Position nord(Position pos){
        return new Position(pos.getLigne()-1,pos.getColonne());
    }
    /**
     * Returns a new Position object that is one step to the north-east of the current position.
     * @param pos the current position
     * @return a new Position object to the north-east of the current position
     */
    public Position nordEst(Position pos){
        return new Position(pos.getLigne()+1,pos.getColonne()+1);
    }
    
    /**
     * Returns a new Position object that is one step to the east of the current position.
     * @param pos the current position
     * @return a new Position object to the east of the current position
     */
    public Position est(Position pos){
        return new Position(pos.getLigne(),pos.getColonne()+1);
    }
    /**
     * Returns a new Position object that is a neighbor of the current position.
     * @param pos the current position
     * @return a new Position object a neighbor of the current position
     */

    public Position neighbour(Direction dir){
        return new Position( 
            this.getLigne()+dir.getDeltaX(),
            this.getColonne()+dir.getDeltaY());
    }

}