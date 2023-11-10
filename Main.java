import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Room currentRoom;

        Apartment apartment = new Apartment();
        Kitchen kitchen = new Kitchen("kitchen",false, false);
        Bathroom bathroom = new Bathroom("bathroom",false,false);
        Room hallway = new Room("hallway",false);
        apartment.addNewRoom(kitchen);
        apartment.addNewRoom(bathroom);
        apartment.addNewRoom(hallway);
        currentRoom = hallway;
    }
}