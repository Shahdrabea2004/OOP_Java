package Task6;

import Task5.Student;

import java.util.Scanner;

/*
Please Create App that accept id , name of privateschool  &&
id, name of puplicschool Student and print them (with oop)
 */
public class Main {
    public static void main(String []shahd){
       Scanner sc=new Scanner(System.in);
        // Student Private School
        System.out.println("Enter Student Private School id, name: ");
        int idPrivate = sc.nextInt();
        sc.nextLine();
        String NamePrivate = sc.nextLine();
        // Student Public School
        System.out.println("Enter Student Public School id, name: ");
        int idPublic = sc.nextInt();
        sc.nextLine();
        String NamePublic = sc.nextLine();

        BaseEntity baseEntity;

        // Student Private School
        System.out.println("Data for Private School Student: ");
        baseEntity=new PrivateSchoolStudentData(idPrivate,NamePrivate);
        System.out.println(baseEntity.toString()+"\n");
        // Student Private School
        System.out.println("Data for Public School Student: ");
        baseEntity=new PuplicSchoolStudentData(idPublic,NamePublic);
        System.out.println(baseEntity.toString());

    }
}
