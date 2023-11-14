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
        System.out.println("1) Switch Light");
        System.out.println("2) Leave Room");
        System.out.println("3) Enter neighboring Room");
        if (roomStack.getLast().equals("kitchen")) {
            System.out.println("4) Switch Stove");
        } else if (roomStack.getLast().equals("bathroom")) {
            System.out.println("4) Switch Shower");
        }
        int input = scanner.nextInt();
        switch (input){
            case 1:
                switchLight();
                enter();
                break;
            case 2:
                leave();
                break;
            case 3:
                selectRoom(Room.this);
                break;
            case 4:
                if (roomStack.getLast().equals("kitchen")){
                    Kitchen.switchStove();
                } else if (roomStack.getLast().equals("bathroom")){
                    Bathroom.switchShower();
                }
                enter();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public void selectRoom(Room room){
        ArrayList<Room> neighbors = Apartment.getNeighbours(room);
        System.out.println("Which Room?");
        for (int i =0; i<neighbors.size();i++){
            System.out.println(i+1+") "+neighbors.get(i).getName());
        }
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input < neighbors.size()+1) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Input out of range. Please enter a number between 1 and " + (neighbors.size() ) + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input from scanner
            }
        }
        Room selectedRoom = neighbors.get(input-1);

        // Assuming Room class has an enter() method
        selectedRoom.enter();
    }
    public void leave(){
        if (roomStack.size()==0){
            System.out.println("Apartment left!");
            System.exit(0);
        }
        else {
            System.out.println("Returning to previous room.");
            roomStack.pop();
        }

    }
    public void switchLight(){
        lighting = !lighting;
    }
}
