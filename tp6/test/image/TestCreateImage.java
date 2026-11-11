package image;
import image.*;
import image.color.GrayColor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestCreateImage {

    @Test
    public  void createImageOk(){
        Image img= new Image(10,10);
        assertEquals(10,img.getHeight());
        assertEquals(10,img.getWidth());

    }

    @Test
    public void createImageExceptionOk(){
        Image img= new Image(10,10);
        assertEquals(new Pixel(GrayColor.WHITE), img.getPixel(3,3));
    }

    @Test
    public void createImageException()throws UnknownPixelException{
        Image img= new Image(10,10);
        assertThrows(UnknownPixelException.class, () -> {
            img.getPixel(11, 11);
        });
    }

}