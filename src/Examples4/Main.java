package Examples4;

public class Main {
    public static void main(String[]args){
        Employee employee=new Employee("shahd","fayuom","backend","sha@",50000);
        System.out.println(employee.getSalary());

        SalariedEmployee salariedEmployee=new SalariedEmployee("shahd","fayuom","backend","sha@",50000,10000);
        System.out.println(salariedEmployee.getSalary());

        DailyEmployee dailyEmployee=new DailyEmployee("shahd","fayuom","backend","sha@",0,1000,5);
        System.out.println(dailyEmployee.getSalary());
        
        HourlyEmployee hourlyEmployee=new HourlyEmployee("shahd","fayuom","backend","sha@",0,20,60);
        System.out.println(hourlyEmployee.getSalary());


        Employee objCasting=new SalariedEmployee("shahd","fayuom","backend","sha@",50000,10000);
        System.out.println(objCasting.getSalary());//run in SalariedEmployee

        objCasting.print();
    }
}

