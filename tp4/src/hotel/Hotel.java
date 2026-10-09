package hotel;
import hotel.util.*;
/**
 * An Hotel has a name and some rooms continuously numbered from 1
 *
 */
public class Hotel {

   private final String name;
   private Room[] rooms;
   
   /** build an Hotel with given name, status and number of rooms
    * @param name this hotel name
    * @param status status of the rooms in this hotel
    * @param numberOfRooms number of rooms of this hotel
    */
   public Hotel(String name, Status status, int numberOfRooms) {
      this.name = name;
      this.rooms=new Room [numberOfRooms];
      for (int i=1;i<=this.rooms.length;i++){
        Room room=new Room(i,status);
        this.rooms[i-1]=room;

      }
       // TODO : initialisation de l'attribut rooms
   }

    /** return this hotel name
    * @return this hotel name
    */
   public String getName() {
      return this.name;
   }


   /**  return the number of rooms for this hotel
    * @return the number of rooms for this hotel
    */
   public int numberOfRooms() {
       // TODO
      return this.rooms.length;
   }
   
   /** provide the room corresponding to given number, first room has number 1, 
    * number must not be greater than <code>this.numberOfRooms()</code>, else, if
    * number is not valid <code>null</code> is returned
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number or null if number is not valid
    */
   public Room getRoom(int number) throws ArrayIndexOutOfBoundsException {

       // TODO
       Room room;
       try {
        room=this.rooms[number-1];

       }catch(ArrayIndexOutOfBoundsException e){
        return null;
       }
       return room;

   }
      
   /**
 * Loue une chambre de l'hôtel.
 *
 * @param number le numéro de la chambre à louer
 * @return la chambre louée
 * @throws RoomNotAvailableException si la chambre est déjà louée
 *         ou si le numéro de chambre n'est pas valide
 */
   public Room rentRoom(int number) throws RoomNotAvailableException {
    
    if (number >= 1 && number <= this.rooms.length && !this.rooms[number - 1].isRent()) {
        Room room = this.rooms[number - 1];
        room.rent();
        return room;
    }

    throw new RoomNotAvailableException("Room not Available");
    }
   
   /**
 * Rend une chambre louée.
 * Il n'y a pas d'effet si la chambre n'était pas louée.
 *
 * @param number le numéro de la chambre à rendre
 */
   public void leaveRoom(int number) {

       if (this.rooms[number - 1].isRent()){
        this.rooms[number - 1].free();
       }
   }
   
   
   /**
 * Retourne le nombre de chambres libres dans l'hôtel.
 *
 * @return le nombre de chambres libres
 */
   public int numberOfFreeRooms() {
       // TODO
       int cpt=0;
       for(int i=1;i<=this.rooms.length;i++ ){
        if (!(this.rooms[i-1].isRent())){
            cpt=cpt+1;
        }
       } 
       return cpt;
   }    
   
   /**
 * Retourne le plus petit numéro d'une chambre libre.
 *
 * @return le plus petit numéro d'une chambre libre,
 *         ou 0 si aucune chambre n'est libre
 */
   public int firstFreeNumber() {
       
       for(int i=1;i<=this.rooms.length;i++ ){
        if (!(this.rooms[i-1].isRent())){
            return i;
        }
       } 
       return 0;
       
   }

   
}
