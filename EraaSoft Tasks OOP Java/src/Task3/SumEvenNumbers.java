package Task3;

public class SumEvenNumbers {
    private int number1;
    private int number2;
    private int number3;
    private boolean checkEven=true;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        if(number1%2!=0){
            checkEven=false;
            return;
        }
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        if(number2%2!=0){
            checkEven=false;
            return;
        }
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        if(number3%2!=0){
            checkEven=false;
            return;
        }
        this.number3 = number3;
    }

    public void sum(){
        if(checkEven==false){
            System.out.println("I can't Sum .Must be 3 Numbers even!");
        }
        else {
            System.out.println("Sum Even Number: "+(this.number1 + this.number2 + this.number3));
        }
    }
}
