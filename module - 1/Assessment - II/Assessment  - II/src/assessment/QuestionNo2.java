package assessment;



interface IBankAccount{
    void setBalance(double balance);
    double getBalance();

    boolean deposit(double amount);

}

interface ICheckingAccount {
    double getOverdraftLimit();
    double getBalance();
    void setBalance(double balance);

    void withdraw(double amount) throws Exception;
}

class SavingsAccount implements IBankAccount{
    private double balance;

    public void display() {
        System.out.println("Savings Account: \n\t InitialBalance: " + getBalance());
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(double amount) {
        try {
            this.balance += amount;
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
class CheckingAccount implements ICheckingAccount{
    private double overdraftLimit = 1000;
    private double balance;
    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance ){
            throw new Exception("\t Invalid Transaction: The Balance is less then the amount you entered.");
        } else if (this.overdraftLimit > (this.balance - amount)) {
            System.out.println("\t Overdraft Limit: " + getOverdraftLimit());
            throw new Exception("\t Invalid Transaction: You can't withdraw money less than OverdraftLimit");
        } else {
            this.balance -= amount;
        }
    }


    public void display() {
        System.out.println("Checking Account: \n\t InitialBalance: "+ getBalance()
                +"\n\t Overdraft Limit: " + getOverdraftLimit());
    }

    @Override
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }



}
public class QuestionNo2 {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount();
        obj1.setBalance(2000);
        obj1.display();
        CheckingAccount obj2 = new CheckingAccount();
        obj2.setBalance(5000);
        obj2.display();
        System.out.println("Performing Transaction:");
        try {
            obj1.deposit(1000);
            System.out.println("\t The amount in your savings accout " + obj1.getBalance());
            obj2.withdraw(4500);
            System.out.println("\t The amount after withdraw in your checking account " + obj2.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
