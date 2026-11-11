package image;
import image.*;
import image.color.GrayColor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestFillRectangle{

    @Test
    public void correctRectangle(){
        Image img= new Image(10,10);
        img.fillRectangle(2,2,2,2,GrayColor.BLACK);
        for (int i=2;i<4;i++){
            for (int j=2;j<4;j++){
                assertEquals(GrayColor.BLACK, img.getPixel(i,j).getColor());
            }
        }
    }

    @Test
    public void rectangleOutOfBounds()throws UnknownPixelException{
        Image img= new Image(10,10);
        assertThrows(UnknownPixelException.class, () -> {
            img.fillRectangle(8,8,5,5,GrayColor.BLACK);
        }); 
    }

}