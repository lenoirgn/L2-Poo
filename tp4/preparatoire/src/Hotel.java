
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
      return -1000;
   }
   
   /** provide the room corresponding to given number, first room has number 1, 
    * number must not be greater than <code>this.numberOfRooms()</code>, else, if
    * number is not valid <code>null</code> is returned
    * @param number number of the room, from 1 to this.numberOfRooms()
    * @return the room with given number or null if number is not valid
    */
   public Room getRoom(int number) {
       // TODO
      return null;
   }
      
   /** 
    * TODO
    */
   public Room rentRoom(int number) throws RoomNotAvailableException {
       // TODO
       return new Room(-1000);
   }
   
   /** 
    * TODO
    */
   public void leaveRoom(int number) {
       // TODO
   }
   
   
   /** 
    * TODO
    */
   public int numberOfFreeRooms() {
       // TODO
       return -1000;
   }   
   
   /** 
    * TODO
    */
   public int firstFreeNumber() {
       // TODO
      return -1000;
   }

   
}
