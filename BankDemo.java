abstract class BankAccount {
    int balance = 0;
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount + ", Balance: ₹" + balance);
    }
    abstract void withdraw(int amount);
}
class SavingsAccount extends BankAccount {
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount Withdraw: ₹" + amount + ", Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance in SavingsAccount!");
        }
    }
}
class CurrentAccount extends BankAccount {
    void withdraw(int amount) {
        balance -= amount;
        System.out.println("CurrentAccount Withdraw: ₹" + amount + ", Balance: ₹" + balance);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount();  
        BankAccount acc2 = new CurrentAccount();

        acc1.deposit(5000);
        acc1.withdraw(2000);

        acc2.deposit(3000);
        acc2.withdraw(4000);
    }
}
