public class Bathroom extends Room {
    static boolean shower;
    public Bathroom(String name, boolean lightning, boolean shower) {
        super(name, lightning);
        this.shower = shower;
    }
    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void switchLight() {
        super.switchLight();
    }

    public static void switchShower(){
        shower = !shower;
    }
}
