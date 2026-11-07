package image;
import image.color.*;
import java.lang.Math;

public class Pixel{
    private GrayColor gColor;

    public Pixel(int val){
        this.gColor= new GrayColor(val);

    }
    public Pixel(GrayColor gcolor){
        this.gColor=gcolor;
    }
    public boolean equals(Object o){
        if(!(o instanceof Pixel)){
            return false;
        }
        Pixel other= (Pixel) o;
        return this.gColor.equals(other.gColor);
    }

    public GrayColor getColor(){
        return this.gColor;
    }

    public void setColor( GrayColor color){
        this.gColor=color; 
    }

    public  int colorLevelDifference( Pixel p){
        return Math.abs(this.gColor.getGrayLevel()-p.gColor.getGrayLevel());
    }
}