package Examples10;

public class TestClass {
    public TestClass() {
        System.out.println("default constructor");
    }

    public TestClass(int x) {
        System.out.println("Param constructor");
    }

    {
        System.out.println("I'm Initializer Block in Test Class");
    }

    public void print(){
        System.out.println("I'm function in test class");
    }
}
