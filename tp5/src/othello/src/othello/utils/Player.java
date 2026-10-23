package othello.utils;

public class Player{
    private Color color;
    public Player(Color color){
        this.color=color;
    }
    /**
     * Returns the color of this Player.
     * @return the color of the Player
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * 
     */
    public String toString(){
        return "Joueur au pion "+ this.color;
    }

    public boolean  equals(Object o){
        if (!(o instanceof Player)){
            return false;
        }
       Player other =(Player) o;
        return this.color==other.color;
    }
    
} 