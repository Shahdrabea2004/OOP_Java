package Task10.Services;

import Task10.model.School;
import Task10.model.Student;

import java.util.ArrayList;

public class ShowStudentImp extends BaseStudentImp{
    @Override
    public void ShowStudent(School school) {
        System.out.println("----- Showing Students -----");
        if (school.students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student s : school.students) {
                System.out.println(s);
            }
        }
    }
}
