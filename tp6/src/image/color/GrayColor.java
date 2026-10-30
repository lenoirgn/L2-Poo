public class GrayColor{
    public static final GrayColor WHITE= new GrayColor(255);
    public static final GrayColor BLACK= new GrayColor(0);
    
    private int grayLevel;

    public GrayColor(int level){
        this.grayLevel=level;
    }  

    public int getGrayLevel(){
        return this.grayLevel;
    }

    public boolean equals(Object o){
        if (!(o instanceof GrayColor )){
            return false;
        }
        GrayColor other=(GrayColor) o;
        return this.grayLevel==other.grayLevel;
    }
}