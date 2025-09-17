package Task1;
/*
Please Create App that accept id , name and age of Student and print them (with oop)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student=new Student();
        //ID
        System.out.print("Enter Student ID: ");
        student.setId(sc.nextLine());
        //Name
        System.out.print("Enter Student Name: ");
        student.setName(sc.nextLine());
        //Age
        System.out.print("Enter Student Age: ");
        student.setAge(sc.nextInt());
        //Print
        System.out.println(student.toString());
    }
}