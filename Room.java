import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;

public class Room {
    String name;
    boolean lighting;
    ArrayList<Room> neighbourRooms;
    public Room(String name, boolean lighting) {
        this.name = name;
        this.lighting= lighting;
    }
    public void enter(){
    }
    public void addNeighbour(Room neighbour){
        neighbourRooms.add(neighbour);
    }
    public void switchLight(){
        lighting = !lighting;
    }
}
