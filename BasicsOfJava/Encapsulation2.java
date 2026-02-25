package BasicsOfJava;
class BankAccount{
    private double balance;

    public double gatter(){
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposit(5000);
        b1.withdraw(2000);
       System.out.println(b1.gatter());
        
    }
}
