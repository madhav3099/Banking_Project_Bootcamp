import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private float balance;
    private List transactions;

    public BankAccount(){
        this.transactions = new ArrayList();
    }
    public BankAccount(float balance){
        this.balance = balance;
        this.transactions = new ArrayList<>(); // Initialize transaction history
        transactions.add("Initial Balance: " + balance);
    }
    public void deposit(float amount){
        balance += amount;
        transactions.add("Deposited: "+amount);
    }
    public void withdraw(float amount){
        balance -= amount;
        transactions.add("Withdrawn: "+amount);
    }
    public void Transfer(BankAccount destAcc, float amount){
        this.withdraw(amount);
        destAcc.deposit(amount);
        transactions.add("Transferred: "+amount+" to destination account");
    }

    public List gettranscation(){
        return transactions;
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}
