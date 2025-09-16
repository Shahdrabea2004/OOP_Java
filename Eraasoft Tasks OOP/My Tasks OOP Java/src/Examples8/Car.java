package Examples8;

public abstract class Car {
    protected int numberOfWheels;
    protected float height;
    protected float weight;

    public Car() {
    }

    public Car(int numberOfWheels, float height, float weight) {
        this.numberOfWheels = numberOfWheels;
        this.height = height;
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    protected abstract void autopilot();
    protected abstract void streamingService();
    protected abstract void parkingSensor();

}
