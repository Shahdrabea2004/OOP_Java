package Examples8;

public class SUV extends Car{
    protected void autopilot() {
        System.out.println("SUV autopilot");
    }

    @Override
    protected void streamingService() {
        System.out.println("SUV streamingService");
    }

    @Override
    protected void parkingSensor() {
        System.out.println("SUV parkingSensor");
    }
}
