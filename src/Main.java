import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance in your Account: ");
        int balance = sc.nextInt();

        BankAccount Acc = new BankAccount(balance);
        BankAccount destAcc = new BankAccount(0);
        Acc.setBalance(balance);
        while (flag != 1) {

            System.out.println("Enter 1 to Show Balance");
            System.out.println("Enter 2 to Withdraw Money");
            System.out.println("Enter 3 to Deposit Money");
            System.out.println("Enter 4 to Transfer Money");
            System.out.println("Enter 5 to See Transaction history");
            System.out.println("Enter 6 to Save Transaction record in a File");
            System.out.println("Enter 7 to Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Balance in your account = " + Acc.getBalance());
                    System.out.println("--------------------------------------");
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
                        System.out.println("Transaction Failed ..... Insufficient Balance ");
                    }
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit from your account: ");
                    Acc.deposit(sc.nextInt());
                    System.out.print("Money deposited in your account Successfully");
                    System.out.println("\nBalance in your account now: " + Acc.getBalance());
                    System.out.println("--------------------------------------");
                    break;
                case 4:
                    System.out.print("Enter the amount to Transfer from your account to destination account: ");
                    int transferamount = sc.nextInt();
                    if(Acc.getBalance() > transferamount) {
                        Acc.Transfer(destAcc, transferamount);
                        System.out.println("Money transferred Successfully");
                        System.out.println("Balance in your account now: " + Acc.getBalance());
                        System.out.println("Balance in destination account now: " + destAcc.getBalance() + "\n");
                    }
                    else{
                     System.out.println("Transaction Failed ..... Insufficient Balance ");
                    }
                    System.out.println("--------------------------------------");
                    break;
                case 5:
                    System.out.println("Transaction history");
                    for(Object t :Acc.gettranscation()){
                        System.out.println(t);
                    }
                    System.out.println("Current Balance: " + Acc.getBalance());
                    System.out.println("--------------------------------------");
                    break;
                case 6:
                    System.out.print("Enter file name to save report (e.g., report.txt): ");
                    String fileName = sc.next();
                    Acc.saveTransactionReport(fileName);
                    System.out.println("--------------------------------------");
                    break;
                case 7:
                    flag = 1;
                    System.out.println("\nFinal Balance in your account: " + Acc.getBalance());
                    System.out.println("Thank you for using our account!");
                    System.out.println("--------------------------------------");
                    break;
            }




        }
    }
}