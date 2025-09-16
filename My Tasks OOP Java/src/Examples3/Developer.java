package Examples3;

public class Developer extends Employee{
    String projectName;

    @Override
    public String toString() {
        return "Developer{" +
                "projectName='" + projectName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", yearsOfBirth=" + yearsOfBirth +
                '}';
    }

    public Developer() {
    }

    public Developer(String name, String email, String phone, int yearsOfBirth, String projectName) {
        /*this.name = name;
        this.email = email;
        this.phone = phone;
        this.yearsOfBirth = yearsOfBirth;
         */
        //super();
        super(name,email,phone,yearsOfBirth);
        super.email="@t";
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
        super.email="oo";

    }
}
