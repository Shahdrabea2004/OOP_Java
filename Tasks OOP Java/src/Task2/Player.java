package Task2;

public class Player {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if(name.length()<=5){
            throw new IllegalArgumentException("Name Size Must greater that 5.");
        }
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws IllegalArgumentException {
        if(number<=0){
            throw new IllegalArgumentException("Number Must greater that 0. Please repeat input number: ");
        }
        this.number = number;
    }
}
