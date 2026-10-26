package othello.utils;

public class Pion {
    // Le constructeur
    public Pion(Color color){
        this.color = color;
    }
    // Les attributs
    private Color color;

    /**
     * Returns the color of this Pion.
     * @return the color of the Pion
     */
    public Color getCouleur(){
        return this.color;
    }
    
    }