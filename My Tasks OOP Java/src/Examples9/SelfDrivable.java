package Examples9;


public interface SelfDrivable {
    void destination(String d);
    void drive();

    default void newMethod(){
        System.out.println("Add New Feature Version Java 8");
    }
}
