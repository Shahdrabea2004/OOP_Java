package Example5;

public class PersonalInformation {
    private String firstName;
    private String MiddleName;
    private String LastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirth;

    public PersonalInformation() {
    }

    public PersonalInformation(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth) {
        this.firstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
