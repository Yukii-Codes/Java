//Showcases the use of while loop
import java.util.*;
public class PasswordChecker {
    public static void main (String [] args){
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter password");
        String correctPassword = "Pass123";
        String userPassword ;
        while (1 !=0){
            userPassword = ob.nextLine();
            if (!(userPassword.equals(correctPassword)))
                System.out.println("Retry");
            else {
                System.out.println("Access Granted");
                break;
            }
        }
    }
}
