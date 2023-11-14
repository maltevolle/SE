import java.time.Duration;
import java.time.Instant;

public class Kitchen extends Room{
    boolean stove;
    double kWh=0;
    Instant startTime;
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
    public void switchStove() {
        if (stove) {
            Instant endTime = Instant.now();
            Duration duration = Duration.between(startTime, endTime);
            double seconds = duration.getSeconds();
            kWh = (seconds / 3600.0) * 2000;
            System.out.println("kWh consumed: " + kWh);
            kWh = 0;
            stove = false;
        } else {
            startTime = Instant.now();
            stove = true;
        }
    }

}
