package Examples12;

public class NoNameBank {
    private double balance;

    public void deposite(double amount)throws InvalidAmountException {
        if (amount <= 0) {
           throw new InvalidAmountException(amount+"is not Valid");
        }
        balance = balance + amount;
    }

    public double withdraw(double amount) throws InsufficientFundsException{
        if (balance < amount) {
           throw new InsufficientFundsException("Insufficient Funds");
        }
        balance -= amount;
        return amount;
    }
    public void balanceInQuery(){
        System.out.println("Your balance is: "+balance);
    }

}
