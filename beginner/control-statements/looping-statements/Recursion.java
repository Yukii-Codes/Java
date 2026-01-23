//Finding factorial using recursion
import java.util.*;
public class Recursion {
    public float factorial(float number){
        if (number == 1 || number == 0)
            return 1;
        else if (number < 0)
            return -1;
        return number * factorial(number-1);
    }
    public static void main (String [] args){
        Scanner ob = new Scanner(System.in);
        Recursion fact = new Recursion();
        System.out.println("Enter a number");
        float number = ob.nextInt();
        if(fact.factorial(number) != -1)
        System.out.println("Factorial of " + number + " : " + fact.factorial(number));
    }
}
