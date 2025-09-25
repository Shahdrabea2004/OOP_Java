package Task9.model;

import java.util.*;

public class Club {
    private ArrayList<Player> PlayerClubList= new ArrayList<>();

    public ArrayList<Player> getPlayerClubList() {
        return PlayerClubList;
    }

    public void AddPlayerClubList(Player player) {
        PlayerClubList.add(player);
    }


}
