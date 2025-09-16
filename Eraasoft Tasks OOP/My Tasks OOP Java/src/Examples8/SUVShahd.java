package Examples8;

public abstract class SUVShahd extends Car{
    @Override
    protected void autopilot() {
        System.out.println("SUVShahd ");
    }
    protected abstract void streamingService();
    protected abstract void parkingSensor();
}
