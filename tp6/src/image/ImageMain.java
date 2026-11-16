package image;
import image.color.GrayColor;
import image.util.*;

public class ImageMain {
     
   public static void main(String[] args){
      final String LAMP_IMAGE = args[0];
      Image img= new Image(200,200,150);
      img.fillRectangle(20,30, 30, 50, GrayColor.BLACK);
      img.fillRectangle(50,100, 40, 40, new GrayColor(128));
      img.fillRectangle(90,20, 70, 50, new GrayColor(200));
      ImageDisplayer displayer = new ImageDisplayer();
      displayer.display(img, "Image", 100, 100); 

      // Question 10
      Image lampImg = ImageLoader.loadPGM(LAMP_IMAGE);
      img = lampImg.negative();
      displayer.display(img, "LampNeg", 300, 100);
      // Question 12
      if (args.length <=1){
         img = lampImg.edgeExtraction(20);
      }else{
         int seuil = Integer.parseInt(args[1]);
         img = lampImg.edgeExtraction(seuil);
      }
      displayer.display(img, "LampEdge", 600, 100);
   }
}