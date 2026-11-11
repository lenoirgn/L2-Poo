package image;
import image.color.GrayColor;
import image.util.*;

public class ImageMain {

   public static void main(String[] args){
    Image img= new Image(200,200,150);
    img.fillRectangle(20,30, 30, 50, GrayColor.BLACK);
    img.fillRectangle(50,100, 40, 40, new GrayColor(128));
    img.fillRectangle(90,20, 70, 50, new GrayColor(200));
    ImageDisplayer displayer = new ImageDisplayer();
     displayer.display(img, "Image", 200, 200); 

   }
}