package Task9;

import Task9.Services.ClubIMP;
import Task9.model.Player;

public class Main {
    public static void main(String []shahd){
        ClubIMP clubIMP=new ClubIMP();
        Player player=new Player();
        clubIMP.AddDataPlayer(player);
        clubIMP.printDataPlayer(player);
    }
}
