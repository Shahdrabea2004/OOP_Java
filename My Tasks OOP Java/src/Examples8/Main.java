package Examples8;

public class Main {
    static void fun(Car obj){
        obj.autopilot();
    }
    public static void main(String []args){
         SUV carSUV=new SUV();
         carSUV.autopilot();

         SUVAbdo suvAbdo=new SUVAbdo();
         suvAbdo.autopilot();

         fun(new Hatchback());
         fun(new SUV());
         //fun(new SUVShahd())//error;
        //to solve error
        fun(new SUVShahd() {
            @Override
            protected void streamingService() {

            }

            @Override
            protected void parkingSensor() {

            }
        });
    }
}
