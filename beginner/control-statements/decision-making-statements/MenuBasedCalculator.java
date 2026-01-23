//Menu based calculator using switch-case
import java.util.*;
public class MenuBasedCalculator {
    public static void main(String [] args){
        Scanner ob = new Scanner(System.in);
        System.out.println(" Enter 2 numbers ");
        double number1 = ob.nextDouble();
        double number2 = ob.nextDouble();
        System.out.println("------ Menu ------ " +
                "+ for addition \n" +
                "- for substraction \n" +
                "* for multiplication \n" +
                "/ for division \n" +
                "% for remainder ");
        char choice = ob.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println(" Sum : " + (number1 + number2));
                break;
            case '-':
                System.out.println(" Substraction : " + (number1 - number2));
                break;
            case '*':
                System.out.println(" Multiplication : " + (number1 * number2));
                break;
            case '/':
                System.out.println(" Division : " + ((double) number1 / number2));
                break;
            case '%':
                System.out.println(" Remainder : " + (number1 % number2));
                break;
            default:
                System.out.println(" Invalid input");
        }
    }
}
