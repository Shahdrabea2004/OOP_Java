package Task10.Services;

import Task10.model.School;
import Task10.model.Student;

import java.util.ArrayList;

public abstract class BaseStudentImp implements BaseStudent{
    @Override
    public void addStudent(Student student,School school) {
        System.out.println("Base Add Student");
    }

    @Override
    public void ShowStudent(School school) {
        System.out.println("Base Show Students");
    }
}
