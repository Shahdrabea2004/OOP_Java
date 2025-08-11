package Examples4;

public class SalariedEmployee extends Employee{
    float bouns;

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }

    @Override
    public float getSalary() {
        return super.getSalary()+bouns;
    }


    public  static  void print(){
        System.out.println("I static method test override in sub_class😒");
    }
}
