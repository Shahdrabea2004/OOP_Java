package Examples4;

public class DailyEmployee extends Employee{
    private float workDayPrice;
    private int dailyRate;

    public DailyEmployee() {
    }
    @Override
    public void print1(){
        System.out.println("Daily Employee");
    }
    public DailyEmployee(String name, String address, String department, String email, float salary, float workDayPrice, int dailyRate) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }

    @Override
    public float getSalary() {
        return workDayPrice*dailyRate;
    }
}
