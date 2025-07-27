package Examples3;

public class Employee {
    protected String name;
    protected String email;
    protected String phone;
    protected int yearsOfBirth;

    public Employee(String name, String email, String phone, int yearsOfBirth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.yearsOfBirth = yearsOfBirth;
    }

    public Employee() {
        System.out.println("No Parameters");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }

    public void setYearsOfBirth(int yearsOfBirth) {
        this.yearsOfBirth = yearsOfBirth;
    }
}
