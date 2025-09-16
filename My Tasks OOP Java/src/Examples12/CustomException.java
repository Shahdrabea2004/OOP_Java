package Examples12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {
    public static void Validate(int num) {
        if (num <= 0) {
            MyException myException = new MyException("Negative number!");
            throw myException;
        } else {
            System.out.println("Positive!");
        }
    }

    public static void main(String[] shra) {
//        validate Method
//        try {
//            Validate(-1);
//        } catch (MyException ex) {
//            System.out.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
        try {
            Scanner in = new Scanner(System.in);
             NoNameBank noNameBank=new NoNameBank();
             String option="";
            do {
                System.out.println("1. Deposite");
                System.out.println("2. Withdraw");
                System.out.println("3. BalanceEnQuery");
                System.out.println("Enter Option");
                option = in.next();

                switch (option) {
                    case "1": {
                        System.out.println("Enter Deposite Amount");
                        double amount = in.nextDouble();
                        noNameBank.deposite(amount);
                        noNameBank.balanceInQuery();
                        break;
                    }
                    case "2": {
                        System.out.println("Enter Withdraw Amount");
                        double amount = in.nextDouble();
                        double wd = noNameBank.withdraw(amount);
                        System.out.println("Withdraw Amount Is :" + wd);
                        noNameBank.balanceInQuery();
                        break;
                    }
                    case "3": {
                        noNameBank.balanceInQuery();
                        break;
                    }
                    default: {
                        System.out.println("Invalid Option");
                    }
                }

                System.out.println("Do you want to continue (YES/NO)");
                option = in.next();
            } while (option.equalsIgnoreCase("YES") || option.equalsIgnoreCase("Y"));

        }catch (InvalidAmountException | InsufficientFundsException | NumberFormatException | InputMismatchException ex){
            System.out.println(ex.getMessage());
        }


    }
}
