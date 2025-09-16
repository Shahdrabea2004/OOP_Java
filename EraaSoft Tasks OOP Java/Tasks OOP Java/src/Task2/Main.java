package Task2;

import java.util.Scanner;

/*Please Create App that accept number , name of Player and print them (with oop)
look!
- make sure that number is > 0
- make sure that name size > 5
 */
public class Main {
    public static void main(String []shahd) {
        Scanner sc=new Scanner(System.in);
        Player player=new Player();

        while(true) {
            //Number
            try {
                System.out.print("Enter Player Number: ");
                player.setNumber(sc.nextInt());
                sc.nextLine();
                break;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter Player Name: ");
                player.setName(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        //System.out.println();
        //Print
        System.out.println("Number: "+player.getNumber());
        System.out.println("Name: "+player.getName());



    }
}
