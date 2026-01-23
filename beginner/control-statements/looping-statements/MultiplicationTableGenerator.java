//Multiplication table generator using nested loop
import java.util.*;
public class MultiplicationTableGenerator {
    public static void main (String [] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = ob.nextInt();
        System.out.println("Enter ending number");
        int end = ob.nextInt();
        for(int i = start ; i <= end ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.println(i + " * " + j + " : " + (i*j));
            }
            System.out.println("");
        }
    }
}
