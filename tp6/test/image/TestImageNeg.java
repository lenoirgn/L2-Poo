package image;
import image.*;
import image.color.GrayColor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestImageNeg {
    
    @Test
    public void imageNegOk(){
        Image img = new Image(10,10);
        img.negative();
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                assertEquals(GrayColor.BLACK, img.getPixel(i,j).getColor());
            }
        }
    }
}