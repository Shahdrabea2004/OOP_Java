package Task4.model;

import Task4.Validation.Validation;
import Task4.model.Base;

public class Player extends Base implements PlayerServices {
    private int number;

    public Player(int id, String name, int number) {
        super(id, name);
        this.number = number;
    }

    public Player() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void print(Player player) {
        if(!Validation.validatePlayer(player)){
            System.out.println("Please Check Your Data Must ID>0 and number length >=2-->I mean (1:99)");
        }
        else{
            System.out.println("Player ID: " + getId());
            System.out.println("Player Name: " + getName());
            System.out.println("Player Number: " + getNumber());
        }
    }

}
