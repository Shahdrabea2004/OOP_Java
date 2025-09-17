package Task4;


import Task4.model.*;

import java.util.Scanner;

/*
create APP that Accept Player(id,name,number) and student(id , name,age) and print Data
look!
- id must be > 0
- number length must be <=2       0 1     99
- age must be > 7 and < 30
*/
public class Main {
    public static void main(String []shahd){
        Scanner input=new Scanner(System.in);
        //Player Date
        System.out.println("Enter Player ID:");
        int pId = input.nextInt();
        input.nextLine();
        System.out.println("Enter Player Name:");
        String pName = input.nextLine();
        System.out.println("Enter Player Number (1-99):");
        int pNumber = input.nextInt();

        Player player=new Player(pId,pName,pNumber);

        //Student Data
        System.out.println("Enter Student ID:");
        int sId = input.nextInt();
        input.nextLine();
        System.out.println("Enter Student Name:");
        String sName = input.nextLine();
        System.out.println("Enter Student Age (8-29):");
        int sAge = input.nextInt();

        Student student=new Student(sId,sName,sAge);

        // Print data
        System.out.println("\n--- Player Data ---");
        player.print(player);
        System.out.println("\n--- Student Data ---");
        student.print(student);


    }
}
