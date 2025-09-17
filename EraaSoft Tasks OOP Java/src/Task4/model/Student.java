package Task4.model;

import Task4.Validation.Validation;
import Task4.model.Base;

public class Student extends Base implements StudentServices{
    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print(Student student) {
        if(!Validation.validateStudent(student)){
            System.out.println("Please Check Your Data Must ID>0 and age>7 and age<30");
        }
        else{
            System.out.println("Student ID: " + getId());
            System.out.println("Student Name: " + getName());
            System.out.println("Student Age: " + getAge());
        }
    }
}
