package Task10;

import Task10.Services.AddStudentImp;
import Task10.Services.BaseStudent;
import Task10.Services.ShowStudentImp;
import Task10.model.School;
import Task10.model.Student;

public class Main {
    public static void main(String []shahd){
        School school=new School();
        Student student=new Student();
        BaseStudent baseStudent=new AddStudentImp();
        baseStudent.addStudent(student,school);
        baseStudent =new ShowStudentImp();
        baseStudent.ShowStudent(school);


    }
}
