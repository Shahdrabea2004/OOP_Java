package Task9.Services;

import Task9.model.*;

import java.util.Scanner;

public class ClubIMP implements ClubServices {
     Scanner scanner=new Scanner(System.in);
    private PrivateClub privateClub = new PrivateClub();
    private PublicClub publicClub = new PublicClub();



    @Override
    public void AddDataPlayer(Player player) {


        System.out.println("----- Add Player Data -----");
        //Add new Player
        System.out.print("Enter Player ID: ");
        player.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Player Name: ");
        player.setName(scanner.nextLine());

        System.out.print("Enter Player Number : ");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
       //Check Club type
        System.out.print("Enter your Club type options(Private Club Or Public Club): ");
        String type = scanner.nextLine().toLowerCase();

        if (type.equals("private")) {

            System.out.print("Please Enter Password: ");
            String pass=scanner.nextLine();
            if(privateClub.checkPassword(pass)) {
                privateClub.AddPlayerClubList(player);
                System.out.println("Player added successfully to Private Club!");
            }
            else{
                System.out.println("Wrong password! Player not added.");
            }


        }
        else if(type.equals("public")){

            publicClub.AddPlayerClubList(player);
            System.out.println("Player added successfully to Public Club!");
        }
        else{
            System.out.println("Not Found Club Enter");
        }


    }

    @Override
    public void printDataPlayer(Player player) {
        System.out.print("Enter your Club type options(Private Club Or Public Club): ");
        String type = scanner.nextLine().toLowerCase();

        if (type.equals("private")) {
            System.out.print("Please Enter Password: ");
            String pass = scanner.nextLine();
            if (privateClub.checkPassword(pass)) {
                System.out.println("Players in Private Club:");
                if(privateClub.getPlayerClubList()!=null) {
                    for (Player p : privateClub.getPlayerClubList()) {
                        System.out.println(p);
                    }
                }
                else{
                    System.out.println("Club is empty!");
                }

            }
            else{
                System.out.println("Wrong password! Player not added.");
            }

        }
        else{
            System.out.println("Players in Public Club:");
            if(publicClub.getPlayerClubList()!=null){
                for (Player p : publicClub.getPlayerClubList()) {
                    System.out.println(p);
                }
            }
            else{
                System.out.println("Club is empty!");
            }

        }
    }

}
