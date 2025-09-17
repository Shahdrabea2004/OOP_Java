package Task3;

import java.util.Scanner;

/*
Please Create App that accept 3 number and return sum of them (with oop)
look:
- check that 3 number must be even number
 */
public class Main {
    public static void main(String []shahd){
        Scanner sc=new Scanner(System.in);
        SumEvenNumbers sumEvenNumbers=new SumEvenNumbers();

        System.out.print("Enter 3 Numbers: ");
        sumEvenNumbers.setNumber1(sc.nextInt());
        sumEvenNumbers.setNumber2(sc.nextInt());
        sumEvenNumbers.setNumber3(sc.nextInt());

        sumEvenNumbers.sum();

    }

}
