package Examples6;

public class Student {
    final int STUDENT_ID;
    private static final int MAX_STUDENTS;

    static{
        MAX_STUDENTS=1500;
    }
    public Student() {
        STUDENT_ID=245;
    }
    public Student(final int STUDENT_ID) {
        //STUDENT_ID=0;//error
        this.STUDENT_ID = STUDENT_ID;
    }

    @Override
    final public String toString() {
        return "Student{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", MAX_STUDENTS=" +MAX_STUDENTS+
                '}';
    }

    public int getSTUDENT_ID() {
        return STUDENT_ID;
    }
}

class Grade_Student extends  Student{

}
