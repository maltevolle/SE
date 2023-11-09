public class Kitchen extends Room{
    boolean stove;
    public Kitchen(String name, boolean lightning, boolean stove) {
        super(name, lightning);
        this.stove=stove;
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void switchLight() {
        super.switchLight();
    }
    public void switchStove(){
        if (stove){
            stove = false;
            System.out.println("You used ...KWh");
        }
        else {
            stove = true;
        }
    }
}
