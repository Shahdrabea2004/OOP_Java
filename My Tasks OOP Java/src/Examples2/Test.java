package Examples2;


import Examples3.Employee;

public class Test extends Employee {
    int number;

    //from Examples3
    public Test(String name, String email, String phone, int yearsOfBirth, int number) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.yearsOfBirth = yearsOfBirth;
        this.number = number;
    }
}
