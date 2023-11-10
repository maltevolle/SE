public class Kitchen extends Room{
    boolean stove;
    public Kitchen(String name, boolean lighting, boolean stove) {
        super(name, lighting);
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
        stove= !stove;
    }
}
