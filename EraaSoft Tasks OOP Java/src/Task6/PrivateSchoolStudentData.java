package Task6;

public class PrivateSchoolStudentData extends BaseEntity{
    public PrivateSchoolStudentData(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Private School Student -> "+super.toString();
    }
}
