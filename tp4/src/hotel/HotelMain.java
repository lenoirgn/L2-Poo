package hotel;
import hotel.util.*;
public class HotelMain{
    public static void usage(){
        System.out.println("Usage:.../tp4> java -classpath classes hotel.HotelMain <int numberRoom> ");
        System.exit(0);
    }
    public static void main(String[] args) {
        if (args.length==0){
            HotelMain.usage();
        }

        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            HotelMain.usage();
            return;
        }

        Hotel hotel=new Hotel("Califoria",Status.PREMIUM,100);
        System.out.println("le nombre de chambre :" + hotel.numberOfFreeRooms());
        try{
            Room room = hotel.getRoom(number);
            Room resultRoom = hotel.rentRoom(number);
            System.out.println( resultRoom.toString()+ " de status "+resultRoom.getStatus() + " louée.");
            System.out.println("le nombre de chambre libre est:"+ hotel.numberOfFreeRooms());
            room.free();
            System.out.println( resultRoom.toString()+ " de status "+resultRoom.getStatus() + " liberer.");
            
            System.out.println("le nombre de chambre libre est:"+ hotel.numberOfFreeRooms());
          
        } catch (RoomNotAvailableException e) {
          System.out.println(e.getMessage());}
          
        }
        
    }
