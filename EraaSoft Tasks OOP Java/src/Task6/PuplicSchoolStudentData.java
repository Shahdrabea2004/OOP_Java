package Task6;

public class PuplicSchoolStudentData extends BaseEntity{
    public PuplicSchoolStudentData(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Public School Student -> "+super.toString();
    }
}
