package Task10.Services;

import Task10.model.School;
import Task10.model.Student;

import java.util.Scanner;

public class AddStudentImp extends BaseStudentImp{

    Scanner scanner=new Scanner(System.in);
    @Override
    public void addStudent(Student student ,School school) {
        System.out.println("----- Add Student Data -----");
        //Add new Student
        System.out.print("Enter Student ID: ");
        student.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        student.setName(scanner.nextLine());
        school.students.add(student);
    }
}
