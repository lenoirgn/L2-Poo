public class LightBulb {

    private int watt;
    private int lumen;
    private String color;
    private boolean statut;

    /**
     * build l'objet LightBulb
     */
    public LightBulb(int watt,int lumen,String color){
        this.watt=watt;
        this.lumen=lumen;
        this.color=color;
        this.statut=false;
    }
    /**
     * get LightBulb's watt
     * @return 
     */
    public int getWatt(){
        return this.watt;
    }
    /**
     * 
     * @return
     */
    public int getlumen(){
        return this.lumen;
    }
    /**
     * 
     */
    public String getcolor(){
        return this.color;
    }
    /**
     * 
     */
    public void turnOn(){
        this.statut=true;
    }
    /**
     * 
     */
    public void turnOff(){
        this.statut=false;

    }
    /**
     * 
     */
    public boolean isOn(){
        if (this.statut){
            return true;
        }
        return false;
    }
    /**
     * 
     */
    public String toString(){
        String msg="eteint";
        if (this.isOn()){
            msg="allumé";
        }
    
        return "L'ampoule de"+this.color+", qui consomme" + this.watt +", et qui produit" +this.lumen + "est" +msg;  
    }

}