package image;
import image.*;
import image.color.GrayColor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestChangeColor{
    @Test
    public void changeColorPixelOk() {
        Image img= new Image(10,10);
        img.changeColorPixel(8, 9, new GrayColor(100));
       assertEquals((new GrayColor(100)), img.getPixel(8,9).getColor());
       }

    @Test
    public void changeColorPixelException() throws UnknownPixelException{
        Image img= new Image(10,10);
        assertThrows(UnknownPixelException.class, () -> {
            img.changeColorPixel(11, 11, new GrayColor(100));
        });
    }
}