package Examples9;

public class Main {
    static void fun(SelfDrivable obj){
        obj.drive();
    }
    public static void main(String []args){
        //System.out.println(Movable.x);

        CarV1 carV1=new CarV1();
        carV1.drive();

        SelfDrivable selfDrivable=new CarV1();
        selfDrivable.drive();

        fun(selfDrivable);
        fun(new CarV1());

        CarV11 carV11=new CarV11();
        carV11.newMethod();


        SelfDrivable selfDrivable1=new CarV1();
        selfDrivable1.newMethod();

       carV1.newMethod();//CarV1 class add to NewMethod also in version 8



        
    }
}
