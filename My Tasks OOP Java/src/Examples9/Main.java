package Examples9;

import Examples2.Test;

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

        TastNestedInterface test=new TastNestedInterface();

       if(test instanceof MarkerInterface){
           System.out.println("Yes I'm Marker Interface");
       }
       else{
           System.out.println("No I'm Not Marker Interface but I'm TestNestedInterface");
       }
       if(carV11 instanceof MarkerInterface){
            System.out.println("Yes I'm Marker Interface");
       }
        else{
            System.out.println("No I'm Not Marker Interface but I'm TestNestedInterface");
        }

        GenericInterface <CarV1> carGenericInterface=new Car<>();
        CarV1 car=carGenericInterface.carModel();



        
    }
}
