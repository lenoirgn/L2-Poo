public class LightBulbMain{

    
     public static void main(String[] args) {
     LightBulb Light1= new LightBulb(4,1200,"blanche");
     System.out.println(Light1.toString());
     Light1.turnOn();
     System.out.println(Light1.toString());
     }
     
}