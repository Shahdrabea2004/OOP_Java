package Examples10;

public class Main {

    public interface Showable{
        public void print(int x);
    }
    static void display(Showable showable){
       showable.print(55);
    }
    public static void main(String []args){
        RewardClass rewardClass1=new RewardClass();
        rewardClass1.rewordMethod();
        RewardClass rewardClass2=new RewardClass(){
            @Override
            public void rewordMethod() {
                System.out.println("your reward is 150$");
            }
        };
        rewardClass2.rewordMethod();

        RewardClass rewardClass3=new RewardClass();
        rewardClass3.rewordMethod();


        System.out.println("rewardClass1 from class = "+rewardClass1.getClass());
        System.out.println("rewardClass2 from class = "+rewardClass2.getClass());
        System.out.println("rewardClass3 from class = "+rewardClass3.getClass());


        new RewardClass(){
            @Override
            public void rewordMethod() {
                System.out.println("your reward is 99$");
            }
        }.rewordMethod();


        Showable showable;
        showable=new Showable(){
            @Override
            public void print(int x) {
                System.out.println("I'm Inner Class using Interface");
            }
        };
        showable.print(5);

        showable = (int x) -> System.out.println("I'm Inner Class using Interface using Lambda Expression using with single methods 1");
        showable.print(5);

        showable = (x) -> System.out.println("I'm Inner Class using Interface using Lambda Expression using with single methods 2 syntax after java 8");
        showable.print(5);

        display(new Showable() {
                    @Override
                    public void print(int x) {
                        System.out.println("I'm Inner Class using Interface with argument ");
                    }
                }

        );

        var s="sh";
        var testClass=new TestClass(){
            private int x=99;
            {
                System.out.println("I'm Initializer Block in Inner Class");
            }
            @Override
            public void print() {
                System.out.println("I'm function in Inner class");
            }
            public void printInner() {
                System.out.println("I'm function in Inner class Just using var keyword");
            }


        };
        testClass.print();
        testClass.printInner();
    }
}
