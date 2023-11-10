public class Room {
    String name;
    boolean lighting;
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
