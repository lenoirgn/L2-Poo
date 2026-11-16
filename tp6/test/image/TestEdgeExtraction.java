package image;
import image.*;
import image.color.GrayColor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestEdgeExtraction{
    @Test
    public void testEdgeExtractionWhiteImage() throws UnknownPixelException {
        Image img = new Image(5, 5);

        Image result = img.edgeExtraction(50);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(GrayColor.WHITE, result.getPixel(i, j).getColor());
            }
        }
    }

    @Test
    public void testEdgeExtractionBlackImage() throws UnknownPixelException {
        Image img = new Image(5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                img.changeColorPixel(i, j, GrayColor.BLACK);
            }
        }

        Image result = img.edgeExtraction(50);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(GrayColor.WHITE, result.getPixel(i, j).getColor());
            }
        }
    }


    @Test
    public void testEdgeExtractionContour() throws UnknownPixelException {
        Image img = new Image(5, 5);

        img.changeColorPixel(2, 2, GrayColor.BLACK);

        Image result = img.edgeExtraction(50);

        assertEquals(GrayColor.BLACK, result.getPixel(2, 2).getColor());
    }
    @Test
    public void testEdgeExtractionBorders() throws UnknownPixelException {
        Image img = new Image(5, 5);

        img.changeColorPixel(0, 0, GrayColor.BLACK);
        img.changeColorPixel(0, 2, GrayColor.BLACK);
        img.changeColorPixel(4, 4, GrayColor.BLACK);

        Image result = img.edgeExtraction(50);

        assertEquals(GrayColor.WHITE, result.getPixel(0, 0).getColor());
        assertEquals(GrayColor.WHITE, result.getPixel(0, 2).getColor());
        assertEquals(GrayColor.WHITE, result.getPixel(4, 4).getColor());
    }
}