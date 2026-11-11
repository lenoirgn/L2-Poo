package image;
import image.color.GrayColor;


public class Image implements ImageInterface{

    private Pixel [][] tabPixel;

    public Image(int haut,int larg ){
        this.tabPixel= new Pixel[haut][larg];
        for (int i = 0; i < haut; i++) {
            for (int j = 0; j < larg; j++) {
                this.tabPixel[i][j] = new Pixel(GrayColor.WHITE);
            }
        }
    }

    public Image(int haut,int larg, int valPixel){
        this.tabPixel= new Pixel[haut][larg];
        for (int i = 0; i < haut; i++) {
            for (int j = 0; j < larg; j++) {
                this.tabPixel[i][j] = new Pixel(valPixel);
            }
        }
    }

    /** returns width of the image
	 * @return width of the image
	 */
	public int getWidth(){
        return this.tabPixel[0].length;
    }

	/** returns height of the image
	 * @return height of the image
	 */
	public int getHeight(){
        return this.tabPixel.length;
    }

	/** get the pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
	 * @param x the horizontal coordinate
	 * @param y the vertical coordinate
	 * @return pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
	 * @exception UnknownPixelException if coord (x,y) is not valid for this image
	 */
	public Pixel getPixel(int x, int y) throws UnknownPixelException{
        Pixel p ;
        if (y < 0 || y>= this.getHeight() ||
            x < 0 || x >= this.getWidth()) {
            throw new UnknownPixelException("Coordonnees invalides");
        }

         p = this.tabPixel[y][x];
         return p;
    }
    public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException{
        if (x < 0 || x >= tabPixel.length ||
            y < 0 || y >= tabPixel[x].length) {
            throw new UnknownPixelException("Coordonnees invalides");
        }
        this.tabPixel[x][y]=new Pixel(color);

    }
    
     public void fillRectangle(int x, int y, int width, int height, GrayColor color){
        for (int i=x;i<height+x;i++){
            for (int j=y;j<width+y;j++){
                this.changeColorPixel(i,j,color);
            }

        }
        
    }
    public Image negative(){
        Image imgNeg = new Image(this.getHeight(),this.getWidth());
        for (int i=0;i<this.getHeight();i++){
            for (int j=0;j<this.getWidth();j++){
                GrayColor color = new GrayColor(255-this.getPixel(j,i).getColor().getGrayLevel());
                imgNeg.changeColorPixel(i,j,color); 
            }
        }
        return imgNeg;
    }

    /**
     * Checks if the pixel at (x, y) is a contour pixel based on the given threshold.
     * A pixel is considered a contour if the difference in gray level with its right or bottom neighbor is greater than the threshold.
     * @param x the horizontal coordinate of the pixel
     * @param y the vertical coordinate of the pixel
     * @param threshold the threshold for contour detection
     * @return true if the pixel is a contour, false otherwise
     */
    public boolean isContour(int x, int y, int threshold) {
        Pixel current = this.getPixel(x, y);
        Pixel right = this.getPixel(x + 1, y);
        Pixel bottom = this.getPixel(x, y + 1);

        return current.colorLevelDifference(right) > threshold ||
            current.colorLevelDifference(bottom) > threshold;
    }
    /**
     * returns a new image with the contours of this image. A pixel is considered a contour if the difference in gray level with its right or bottom neighbor is greater than the given threshold.
     * @param threshold the threshold for contour detection
     * @return a new image with the contours of this image
     */
    public Image edgeExtraction(int threshold){
        Image imgEdge = new Image(this.getHeight(),this.getWidth());
        for (int i=1;i<this.getHeight()-1;i++){
            for (int j=1;j<this.getWidth()-1;j++){
                if (this.isContour(j,i,threshold)){
                    imgEdge.changeColorPixel(i,j,GrayColor.BLACK);
                } 
            }
        }
        return imgEdge;

    }
 
}