public class BankAccount {

    private float balance;

    public BankAccount(){}
    public BankAccount(float balance){
        this.balance = balance;
    }
    public void deposit(float amount){
        balance += amount;
    }
    public void withdraw(float amount){
        balance -= amount;
    }
    public void Transfer(BankAccount destAcc, float amount){
        withdraw(amount);
        destAcc.deposit(amount);

    }



    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}
