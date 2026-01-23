// Showcases the use of do-while loop
import java.util.*;
public class ATMMenuSystem {
    int balance = 0;
    public void depositMoney(int amount) {
        balance += amount;
    }
    public void withdrawMoney(int amount) {
        balance -= amount;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        ATMMenuSystem atm = new ATMMenuSystem();
        int ch;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            ch = ob.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Balance: " + atm.balance);
                    break;
                case 2:
                    System.out.println("Enter deposit amount:");
                    int deposit = ob.nextInt();
                    atm.depositMoney(deposit);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount:");
                    int withdraw = ob.nextInt();
                    atm.withdrawMoney(withdraw);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    System.out.println("Balance: " + atm.balance);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}
