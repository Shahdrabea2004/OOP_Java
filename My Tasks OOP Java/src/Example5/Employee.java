package Example5;

public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personalInformation;
    private Department department;

    public Employee() {
    }

    public Employee(int id, float salary,String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department department) {
        this.id = id;
        this.salary = salary;
        //Composition
        this.personalInformation =new PersonalInformation(firstName,  middleName, lastName, bloodGroup,accountNumber,nationality,yearOfBirth);
        //Aggregation
        this.department = department;
    }

// if Department not content toString function
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", salary=" + salary +
//                ", personalInformation=" + personalInformation +
//                ", department=" + "{ departmentNo=" +department.getDeptNo()+", departmentName="+department.getDeptName()+"} "+
//                '}';
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInformation=" + personalInformation +
                ", department=" + department +
                '}';
    }
}
