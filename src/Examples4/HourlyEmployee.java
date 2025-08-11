package Examples4;

public class HourlyEmployee extends Employee{
    private float workOurPrice;
    private int hourlyRate;

    public HourlyEmployee(String name, String address, String department, String email, float salary, float workOurPrice, int hourlyRate) {
        super(name, address, department, email, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float getSalary() {
        return workOurPrice*hourlyRate;
    }
}
