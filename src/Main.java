import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance in your Account: ");
        int balance = sc.nextInt();

        BankAccount Acc = new BankAccount();
        Acc.setBalance(balance);
        while (flag != 1) {

            System.out.println("Enter 1 to Show Balance");
            System.out.println("Enter 2 to Withdraw Money");
            System.out.println("Enter 3 to Deposit Money");
            System.out.println("Enter 4 to Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Balance in your account = " + Acc.getBalance());
                    break;
                case 2:

                    System.out.print("Enter the amount to withdraw from your account: ");
                    int amount = sc.nextInt();
                    if(Acc.getBalance()>amount){
                    Acc.withdraw(amount);
                    System.out.print("Money withdrawn from your account Successfully");
                    System.out.println("\nBalance in your account now: " + Acc.getBalance());
                    }
                    else {
                        System.out.print("Transaction Failed ..... Insufficient Balance ");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit from your account: ");
                    Acc.deposit(sc.nextInt());
                    System.out.print("Money deposited in your account Successfully");
                    System.out.println("\nBalance in your account now: " + Acc.getBalance());
                    break;
                case 4:
                    flag = 1;
                    System.out.println("Thank you for using our account!");
                    break;
            }
            System.out.println("\n");



        }
    }
}