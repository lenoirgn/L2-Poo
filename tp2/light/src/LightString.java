public class LightString{
    private int nbBulbs;
    private LightBulb[] guirlandeBulbs;
    /**
     * builds a LightString with a given number of LightBulbs
     * @param nbBulbs the number of LightBulbs in the LightString
     */
    public LightString(int nbBulbs){
        this.nbBulbs=nbBulbs;
        this.guirlandeBulbs=new LightBulb[nbBulbs+1];
        for (int i=1;i<=nbBulbs;i++){
            this.guirlandeBulbs[i]=new LightBulb(1,100,"blanche");
        }
    }
    /**
     * gets the i-th LightBulb of the LightString
     * @param i the index of the LightBulb to get
     * @return  the i-th LightBulb of the LightString
        
     */
    public LightBulb getLightBulb(int i){
        return this.guirlandeBulbs[i];
    }
    /** replace the n-th lightbulb of the light string by the given lightbulb.
* Nothing happens if i is not a valid index.
* @param i the number of the lightbulb to be changed (first has number 1)
* @param theBulb the new lightbulb
*/
public void changeLightbulb(int i, LightBulb theBulb){
    if (i>0 && i<=this.nbBulbs){
        this.guirlandeBulbs[i]=theBulb;
    }
}

/**
 * returns the total consumed power of the light string,
 * @return  the total consumed power of the light string
 */

public int getConsumedPower(){
   if (this.guirlandeBulbs[1].isOn()){
    return this.nbBulbs;
   }
    return 0;
}
/**
 * turns on all the light bulbs of the light string
 */
public void turnOn(){
    for (int i = 1; i <= this.nbBulbs; i++) {
        this.guirlandeBulbs[i].turnOn();
        }
}
/**
 * turns off all the light bulbs of the light string
 */
public void turnOff(){
    for (int i = 1; i <= this.nbBulbs; i++) {
        this.guirlandeBulbs[i].turnOff();
        }
}
}

