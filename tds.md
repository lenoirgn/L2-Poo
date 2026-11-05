 # TDS Interfaces
## Exercice3 

* Q1.

```
public class Add implements Operator{

    public int compute(int x,int y){
        return x+y;
    }
    public char getChar(){
        return '+';
    }
}
```
8
* Q2 & Q3

```
public class ExpressionBinairy{
    private int x;
    private int y;
    private Operator opera;

    public ExpressionBinairy(int x, int y, Operator opera){
        this.x=x;
        this.y=y;
        this.opera=opera;
    }
    public int getValues(){
        return this.opera.compute(this.x, this.y);
    }
    public String toString(){
        return Integer.toString(this.x) + this.opera.getChar()+Integer.toString(this.y);
    }

    public static void main(String[] args) {
        Operator add=new Add();
        Operator mult=new Mult();
        ExpressionBinairy binAdd=new ExpressionBinairy(1,2,add);
        System.out.println(binAdd.getValues());
        System.out.println(binAdd.toString());
        ExpressionBinairy bin=new ExpressionBinairy(6,7,mult);
        System.out.println(bin.getValues());
        System.out.println(bin.toString());


    }
}
```

# TDS Agency
Q1-Q7
```

import java.util.ArrayList;
import java.util.List;
import rental.Vehicle;

public class RentalAgency{
   private List<Vehicle> allVehicles;

   public RentalAgency(){
    this.allVehicles=new ArrayList<>();
   }
   public void displayAllvehicles(){
        for(Vehicle veh: this.allVehicles){
            System.out.println(veh.toString());
        }
   }

   public void removeVehicle(Vehicle veh) throws UnknownVehicleException{
        if (this.allVehicles.contains(veh)){
            this.allVehicles.remove(veh);
        }else{
            throw new UnknownVehicleException();
        }
   }
   public List<Vehicle> selectByMaxPrice100(){
        List<Vehicle> res= new ArrayList<>();
        for (Vehicle veh: this.allVehicles ){
            if(veh.getDailyRentalPrice()<100){
                res.add(veh);
            }
        }
        return res;
   }
   public List<Vehicle> selectByBrandTimoleon(){
        List<Vehicle> res= new ArrayList<>();
        for (Vehicle veh: this.allVehicles ){
            if(veh.getBrand().equals("Timoleon")){
                res.add(veh);
            }
        }
        return res;
   }


} 
```


