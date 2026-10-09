package othello.utils;

public class Pion {
    // Le constructeur
    public Pion(Color color){
        this.color = color;
    }
    // Les attributs
    private Color color;

    public Color getCouleur(){
        return this.color;
    }
    }