import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;

public class Room {
    String name;
    boolean lighting;

    public String getName() {
        return name;
    }

    public Room(String name, boolean lighting) {
        this.name = name;
        this.lighting= lighting;
    }
    public void enter(){
    }

    public void switchLight(){
        lighting = !lighting;
    }
}
