public class LightSwitchMain {
    public static void main(String[] args) {
     LightBulb Light1= new LightBulb(4,1200,"blanche");
     LightSwitch Switch1= new LightSwitch(Light1);
     System.out.println(Switch1.getLightBulb().toString());
     Switch1.push();
     System.out.println(Switch1.getLightBulb().toString());
     }
    }
    
