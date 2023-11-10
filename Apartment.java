import java.util.Stack;
public class Apartment {
    Stack<Room> roomStack = new Stack<>();

    public Apartment() {
    }

    public void enter(){

    }
    public void addNewRoom(Room newRoom){
        roomStack.add(newRoom);
    }
}
