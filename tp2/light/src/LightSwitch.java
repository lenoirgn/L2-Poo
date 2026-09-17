public class LightSwitch{
    /**
     * the  LightSwitch that is associated with a LightBulb
     */
    private LightBulb bulb;
    /**
     * builds a LightSwitch with a given LightBulb
     * @param bulb the LightBulb associated with this LightSwitch
     */
public LightSwitch(LightBulb bulb){
    this.bulb=bulb;
}
/**
     * gets the LightBulb associated with this LightSwitch
     * @return  the LightBulb associated with this LightSwitch
     */
    public LightBulb getLightBulb(){
        return this.bulb;
    }
    /**
     * turns the LightBulb on or off depending on its current state
     * if the LightBulb is on, it will be turned off, and vice versa
     */
    public void push(){
        if (this.bulb.isOn()){
            this.bulb.turnOff();
        }else{
            this.bulb.turnOn();
        }
    }
}