package Task5;

public class Player extends ShareData{
    private int number;

    public Player(int id, String name, String phone, int number) {
        super(id, name, phone);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("{ Player: "+"Number: "+number+" }");
    }
}
