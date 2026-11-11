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
    
 
}