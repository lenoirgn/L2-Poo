
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
   // le quell est le meilleur entre les deux méthodes suivantes pour supprimer un véhicule de la liste allVehicles?
   
   public void removeVehicle(Vehicle veh) throws UnknownVehicleException{
        // cas 1:
        if (this.allVehicles.contains(veh)){
            this.allVehicles.remove(veh);
        }else{
            throw new UnknownVehicleException();
        }
        // cas 2:
        try{
            this.allVehicles.remove(veh);
        }catch(Exception e){
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
Q8-Q10

```
public interface Filter{
    public boolean  filterBy(Vehicle veh);
}

public class SelectByMaxPrice100 implements Filter{

    public boolean filterBy(Vehicle veh){
        return veh.getDailyRentalPrice()<100;
    }

}

public class selectByBrandTimoleon implements Filter{
    public boolean filterBy(Vehicle veh){
        return veh.getBrand().equals("Timoleon");
    }

}

```

Q11. 

En donnant la classe un attribut;

```
package rental;
public class SelectByMaxPrice implements Filter{
    private int price;
    public  SelectByMaxPrice(int price ){
        this.price=price;
    }
    public boolean filterBy(Vehicle veh){
        return veh.getDailyRentalPrice()<this.price;
    }

}


import rental.Filter;
import rental.Vehicle;

public class selectByBrand implements Filter{
    private String  byBrand;

    public selectByBrand(String brand){
        this.byBrand=brand;
    }
    public boolean filterBy(Vehicle veh){
        return veh.getBrand().equals(this.byBrand);
    }

}


public class selectByYear implements Filter{
    private String  byYear;

    public selectByYear(int year){
        this.byYear=year;
    }
    public boolean filterBy(Vehicle veh){
        return veh.getProductionYear >this.byYear ;
    }

}

```
Q12.

```
package rental;

public class SelectByBrandStartBy{
    private char letter;
    public SelectByBrandStartBy(char letter){
        this.letter=letter;
    }
    public boolean filterBy(Vehicle veh){
        return veh.getBrand().charAt(0)==this.letter;
    }
}

```

Q13.

La on peut donner la valeur qu'on veut , la marque souhaiter;
Q14.
```
List<Vehicle> res= new ArrayList<>();
        Filter filt= new SelectByMaxPrice(85);
        for (Vehicle veh: this.allVehicles ){
            if(filt.filterBy(veh)){
                res.add(veh);
            }
        }
        for (Vehicle v : res) {
        System.out.println(v.toString());
    }
    
```

Q15.

```
List<Vehicle> res= new ArrayList<>();
        Filter filtPrice= new SelectByMaxPrice(100);
        Filter filtYear= new SelectByYear(2020);
        
        for (Vehicle veh: this.allVehicles ){
            if(filtPrice.filterBy(veh) && filtYear.filterBy(veh) ){
                res.add(veh);
            }
        }
        for (Vehicle v : res) {
        System.out.println(v.toString());
    }
    
```







