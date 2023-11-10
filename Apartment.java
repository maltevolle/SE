import java.util.Stack;
public class Apartment {
    Stack<Room> roomStack = new Stack<>();

    public Apartment() {
    }

    public void enter(){
        System.out.println("You are in the hallway.");
        System.out.println("What do you want to do?");
    }
    public void addNewRoom(Room newRoom){
        roomStack.add(newRoom);
    }
}
