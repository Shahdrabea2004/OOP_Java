package Examples;

public class OuterClass {
    static int x=10;
    int y=15;
    public static class InnerClass{
        void print(){
            System.out.println("Inner Class Static");
            System.out.println("X = "+x);
        }
    }
    public class InnerClassNonStatic{
        void print(){
            System.out.println("Inner Class Non-Static");
            System.out.println("X = "+x);
            System.out.println("y = "+y);
        }
    }
}
