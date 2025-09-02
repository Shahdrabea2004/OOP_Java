package Examples9;

public class CarV1 implements MarkerInterface, SelfDrivable,Movable {
    private int x,y;
    private int numberOfPassengers;

    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CarV1() {
    }

    @Override
    public void moveUP() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
         x--;
    }

    @Override
    public void moveRight() {
         x++;
    }

    @Override
    public void destination(String d) {
        System.out.println("destination = "+d);
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void newMethod() {
        SelfDrivable.super.newMethod();
        //or
        System.out.println("method in Movable interface");

    }
}
