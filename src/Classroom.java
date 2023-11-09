public class Classroom extends Room {
    boolean shower;
    public Classroom(String name, boolean lightning, boolean shower) {
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

    public void switchShower(){
        if (shower){
            shower = false;
        }
        else {
            shower = true;
        }
    }
}
