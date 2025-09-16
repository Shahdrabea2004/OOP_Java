package Examples8;

public class Hatchback extends Car{

    @Override
    protected void autopilot() {
        System.out.println("Hatchback autopilot");
    }

    @Override
    protected void streamingService() {
        System.out.println("Hatchback streamingService");
    }

    @Override
    protected void parkingSensor() {
        System.out.println("Hatchback parkingSensor");
    }
}
