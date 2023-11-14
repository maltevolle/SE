import java.util.ArrayList;
import java.util.Stack;

public class Apartment {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<ArrayList<String>> neighbourRooms;

    public Apartment() {
        neighbourRooms = new ArrayList<>();
    }

    public void enter() {
        // Logik für das Betreten des Apartments
    }

    public void addNewRoom(Room newRoom) {
        rooms.add(newRoom);
        neighbourRooms.add(new ArrayList<>());
    }

    public void addNeighbour(Room room1, Room room2) {
        int index1 = indexOfRoom(room1);
        int index2 = indexOfRoom(room2);

        if (index1 != -1 && index2 != -1) {
            neighbourRooms.get(index1).add(room2.getName());
            neighbourRooms.get(index2).add(room1.getName());
        } else {
            System.out.println("Fehler: Einer der Räume wurde nicht gefunden.");
        }
    }

    private int indexOfRoom(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getName().equals(room.getName())) {
                return i;
            }
        }
        return -1;  // Raum nicht gefunden
    }

    public static ArrayList<String> getNeighbours(Room room) {
        return neighbourRooms.get(indexOfRoom(room));
    }
}
