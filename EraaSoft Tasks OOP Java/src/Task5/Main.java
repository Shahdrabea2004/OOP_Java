package Task5;

import java.util.Scanner;

/*
Please Create App that accept
Person(id,name)
Player(id , name, number,phone)
student (id,name,age,phone) wit oop

BaseEntity(id,name)
ShareData(phone) extend BaseEntity(id,name)

Person() extend BaseEntity(id,name)
Player(number) extend ShareData(phone) extend BaseEntity(id,name)
student (age) extend ShareData(phone) extend BaseEntity(id,name)
wit oop
 */
public class Main {
    public static void main(String []shahd){
        Scanner sc = new Scanner(System.in);

        // Player
        System.out.println("Enter Player id, name, number, phone: ");
        int pId = sc.nextInt();
        sc.nextLine();
        String pName = sc.nextLine();
        int number = sc.nextInt();
        sc.nextLine();
        String pPhone = sc.nextLine();
        Player player = new Player(pId, pName, pPhone, number);

        // Student
        System.out.println("Enter Student id, name, age, phone: ");
        int sId = sc.nextInt();
        sc.nextLine();
        String sName = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String sPhone = sc.nextLine();
        Student student = new Student(sId, sName,sPhone,age);

        // Person
        System.out.println("Enter Person id, name: ");
        int perId = sc.nextInt();
        sc.nextLine();
        String perName = sc.nextLine();
        Person person = new Person(perId, perName);

        // Print
        System.out.println("\n--- Data ---");
        System.out.println("Player");
        player.print();
        System.out.println();
        System.out.println("Student");
        student.print();
        System.out.println();
        System.out.println("Person");
        person.print();

    }
}
