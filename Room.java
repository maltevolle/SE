import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Room{
    String name;
    boolean lighting;
    Scanner scanner = new Scanner(System.in);
    Stack<String> roomStack = new Stack<>();
    public String getName() {
        return name;
    }

    public Room(String name, boolean lighting) {
        this.name = name;
        this.lighting= lighting;
    }
    public void enter(){
        roomStack.add(name);
        System.out.println("You are in the " + name + ".");
        System.out.println("What do you want to do?");
        int input = scanner.nextInt();
    }
    public void enterNeighboringRoom(Room room){
    }
    public void selectRoom(Room room){
        ArrayList<String> neighbors = Apartment.getNeighbours(room);
        System.out.println("Which Room?");
        for (int i =0; i<neighbors.size();i++){
            System.out.println(i+") "+neighbors.get(i));
        }
        int input = scanner.nextInt();
    }
    public void leave(){
        if (roomStack.size()==0){
            System.out.println("Apartment left!");
            System.exit(0);
        }
        roomStack.pop();
    }
    public void switchLight(){
        lighting = !lighting;
    }
}
