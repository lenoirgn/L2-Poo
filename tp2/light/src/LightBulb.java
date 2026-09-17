public class LightBulb {

    private int watt;
    private int lumen;
    private String color;
    private boolean statut;

    /**
     * builds a LightBulb with given watt, lumen and color, initially it is off
     * @param watt the wattage of the light bulb
     * @param lumen the luminous flux of the light bulb
     * @param color the color of the light bulb
     */
    public LightBulb(int watt,int lumen,String color){
        this.watt=watt;
        this.lumen=lumen;
        this.color=color;
        this.statut=false;
    }
    /**
     * get LightBulb's watt
     * @return  the wattage of the light bulb
     */
    public int getWatt(){
        return this.watt;
    }
    /**
     * get LightBulb's lumen
     * @return  the luminous flux of the light bulb
     */
    public int getlumen(){
        return this.lumen;
    }
    /**
     * get LightBulb's color
     * @return  the color of the light bulb
     */
    public String getcolor(){
        return this.color;
    }
    /**
     * turns the light bulb on
     */
    public void turnOn(){
        this.statut=true;
    }
    /**
     * turns the light bulb off
     */
    public void turnOff(){
        this.statut=false;

    }
    /**
     * checks if the light bulb is on
     * @return  true if the light bulb is on, false otherwise
     */
    public boolean isOn(){
        if (this.statut){
            return true;
        }
        return false;
    }
    /**
     * returns a string representation of the light bulb
     * @return  a string describing the light bulb
     */
    public String toString(){
        String msg="eteint";
        if (this.isOn()){
            msg="allumé";
        }
    
        return "L'ampoule de couleur " + this.color + ", qui consomme " + this.watt + " watts, et qui produit " + this.lumen + " lumens est " + msg;  
    }

}