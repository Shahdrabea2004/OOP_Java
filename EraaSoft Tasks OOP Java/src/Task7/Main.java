package Task7;

import java.util.Scanner;
import Task7.model.*;
import Task7.Services.*;
/*
Please Create App that accept
id , name , number , Fcode of clupFc and
id , name , number , Rcode of clupRel
of Player
print
id , name , number
id , name , number , code
 */
public class Main {
    public static void main(String []shahd){
        Scanner scanner = new Scanner(System.in);
        // Club Info
        System.out.println("Enter Player ID: ");
        int cId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Player Name: ");
        String cName = scanner.nextLine();
        System.out.println("Enter Player Number: ");
        int cNumber = scanner.nextInt();

        Club club = new Club();
        club.setId(cId);
        club.setName(cName);
        club.setNumber(cNumber);

        // ClubFC Info
        System.out.println("Enter PlayerFC ID: ");
        int fcId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter PlayerFC Name: ");
        String fcName = scanner.nextLine();
        System.out.println("Enter PlayerFC Number: ");
        int fcNumber = scanner.nextInt();
        System.out.println("Enter PlayerFC Fcode: ");
        int fCode = scanner.nextInt();

        clupFc clubFc = new clupFc();
        clubFc.setId(fcId);
        clubFc.setName(fcName);
        clubFc.setNumber(fcNumber);
        clubFc.setFcode(fCode);

        // ClubRel Info
        System.out.println("Enter PlayerRel ID: ");
        int relId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter PlayerRel Name: ");
        String relName = scanner.nextLine();
        System.out.println("Enter PlayerRel Number: ");
        int relNumber = scanner.nextInt();
        System.out.println("Enter PlayerRel Rcode: ");
        int rCode = scanner.nextInt();

        clupRel clubRel = new clupRel();
        clubRel.setId(relId);
        clubRel.setName(relName);
        clubRel.setNumber(relNumber);
        clubRel.setRcode(rCode);

        // Print Data

        ServiceClup serviceClup=new ServiceClupFcImp();
        serviceClup.printClup(club);
        ServiceClupFc serviceClupFc=new ServiceClupFcImp();
        serviceClupFc.printClupFc(clubFc);


        serviceClup=new ServiceClupRelImp();
        serviceClup.printClup(club);
        ServiceClupRel serviceClupRel=new ServiceClupRelImp();
        serviceClupRel.printClupRel(clubRel);
        

    }
}
