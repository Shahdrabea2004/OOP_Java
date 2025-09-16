package Examples11;
import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.EnumMap;

public class Main {
    interface test{
       public void  testMethod();
    }
    enum WeekDays implements test{
        MONDAY("Working Day") {
            @Override
            public void enumMethod() {
                System.out.println("I,m Monday");
            }
        }, TUESDAY {
            @Override
            public void enumMethod() {

            }
        }, WEDNESDAY {
            @Override
            public void enumMethod() {

            }
        }, THURSDAY {
            @Override
            public void enumMethod() {

            }
        }, FRIDAY {
            @Override
            public void enumMethod() {

            }
        }, SATURDAY {
            @Override
            public void enumMethod() {

            }
        }, SUNDAY {
            @Override
            public void enumMethod() {

            }
        }
        ;
        private String statue;

        WeekDays() {
        }

        WeekDays(String statue) {
            this.statue = statue;
        }

        public String getStatue() {
            return statue;
        }

        public void setStatue(String statue) {
            this.statue = statue;
        }

        @Override
        public void testMethod() {
            System.out.println("I'm Interface method");
        }

        public abstract void enumMethod();
    }
    public static void main(String []args){
         var value=1;
         switch (value){
             case 1:
                 System.out.println("1");
                 break;
             case 2:
                 System.out.println("2");
                 break;
             case 3:
                 System.out.println("3");
                 break;

        }


        final var ONE=1;
        final var TWO=2;
        final var THREE=3;
        switch (ONE){
            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");
                break;

        }


        Numbers val=Numbers.THREE;

        switch (val){
            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");
                break;

        }

        System.out.println(WeekDays.MONDAY.getStatue());
        WeekDays.MONDAY.testMethod();
        WeekDays.MONDAY.enumMethod();


        System.out.println(DayOfWeek.TUESDAY);
        System.out.println(Month.JANUARY);

        //Part2
        Order order1=new Order();
        order1.setStatus(Order.OrderStatus.DELIVERING);
        System.out.println(order1.isDeliverable());
        System.out.println(order1.getStatus());

        System.out.println(WeekDays.FRIDAY.ordinal());
        System.out.println(WeekDays.SUNDAY.compareTo(WeekDays.MONDAY));
        System.out.println(WeekDays.SUNDAY.toString()=="MONDAY");
        System.out.println(WeekDays.MONDAY.name()=="MONDAY");
        System.out.println(WeekDays.valueOf("MONDAY"));
        System.out.println(Arrays.toString(WeekDays.values()));
        for (WeekDays day:WeekDays.values()) {
            System.out.print(" - "+day);
        }
        System.out.println();
        System.out.println(WeekDays.values());

        WeekDays day1=WeekDays.SUNDAY;
        if(WeekDays.MONDAY==day1){
            System.out.println("Woooooooooo");
        }
        else{
            System.out.println("oooohhh");
        }
        if(day1.equals(WeekDays.SUNDAY)){
            System.out.println("Woooooooooo");
        }

        EnumSet<WeekDays> days=EnumSet.of(WeekDays.FRIDAY,WeekDays.MONDAY,WeekDays.FRIDAY);
        days.add(WeekDays.MONDAY);
        System.out.println(days);

        EnumSet<WeekDays> days2=EnumSet.allOf(WeekDays.class);
        System.out.println(days2);

        EnumSet<WeekDays> days3=EnumSet.range(WeekDays.FRIDAY,WeekDays.SUNDAY);
        System.out.println(days3);

        EnumSet<WeekDays> days4=EnumSet.noneOf(WeekDays.class);
        days4.add(WeekDays.SUNDAY);
        days4.addAll(days2);
        System.out.println(days4);
        days4.remove(WeekDays.MONDAY);
        days4.removeAll(days);
        System.out.println(days4);

        EnumMap<WeekDays ,WeekDays> daysEnumMap=new EnumMap<>(WeekDays.class);
        daysEnumMap.put(WeekDays.SUNDAY,WeekDays.MONDAY);
        daysEnumMap.put(WeekDays.SUNDAY,WeekDays.MONDAY);
        System.out.println(daysEnumMap);

        EnumMap<WeekDays ,String> daysEnumMap2=new EnumMap<>(WeekDays.class);
        daysEnumMap2.put(WeekDays.SUNDAY,"Working");
        daysEnumMap2.put(WeekDays.MONDAY,"Holiday");
        EnumMap<WeekDays, String> tempMap = new EnumMap<>(WeekDays.class);
        for (WeekDays day : WeekDays.values()) {
            tempMap.put(day, "Weekday");
        }
        daysEnumMap2.putAll(tempMap);
        System.out.println(daysEnumMap2);






    }
}
