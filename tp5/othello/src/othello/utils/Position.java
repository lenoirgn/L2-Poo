package othello.utils;
public class Position{
   
    private int ligne;
    private int colonne;

    public Position(int ligne,int colonne){
    this.ligne=ligne;
    this.colonne=colonne;
   }
   public int getLigne(){
    return this.ligne;
   }
   public int getColonne(){
    return this.colonne;
   }

    

    public Position sudEst(Position pos){
        return new Position(pos.getLigne()+1,pos.getColonne()+1);
    }
    
    public Position nord(Position pos){
        return new Position(pos.getLigne()-1,pos.getColonne());
    }
    public Position nordEst(Position pos){
        return new Position(pos.getLigne()+1,pos.getColonne()+1);
    }
    
    public Position est(Position pos){
        return new Position(pos.getLigne(),pos.getColonne()+1);
    }

    public Position neighbour(Direction dir){
        return new Position( 
            this.getLigne()+dir.getDeltaX(),
            this.getColonne()+dir.getDeltaY());
    }

}