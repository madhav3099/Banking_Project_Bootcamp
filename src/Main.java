import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance in your Account: ");
        int balance = sc.nextInt();

        BankAccount Acc = new BankAccount();
        Acc.setBalance(balance);

        System.out.println("The Balance in your account = "+Acc.getBalance());
        System.out.print("Enter the amount to withdraw from your account: ");
        Acc.withdraw(sc.nextInt());
        System.out.println("The Balance in your account = "+Acc.getBalance());
        System.out.print("Enter the amount to deposit from your account: ");
        Acc.deposit(sc.nextInt());
        System.out.println("The Balance in your account = "+Acc.getBalance());

    }
}