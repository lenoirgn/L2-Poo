package image;
import image.color.GrayColor;
import image.util.*;

public class ImageMain {
    private static final String LAMP_IMAGE = "/images/lamp.pgm";

   public static void main(String[] args){
      Image img= new Image(200,200,150);
      img.fillRectangle(20,30, 30, 50, GrayColor.BLACK);
      img.fillRectangle(50,100, 40, 40, new GrayColor(128));
      img.fillRectangle(90,20, 70, 50, new GrayColor(200));
      ImageDisplayer displayer = new ImageDisplayer();
      displayer.display(img, "Image", 200, 200); 

      // Question 10
      Image lampImg = ImageLoader.loadPGM(LAMP_IMAGE);
      img = lampImg.negative();
      //displayer.display(img, "LampNeg", 200, 200);
      // Question 11
      img = lampImg.edgeExtraction(20);
      displayer.display(img, "LampEdge", 200, 200);
   }
}