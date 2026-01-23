//Showcases the use of for loop
import java.util.*;
public class DailyStepTracker {
    public static void main (String [] args){
        Scanner ob = new Scanner (System.in);
        int totalSteps = 0;
        double average = 0.0;
        int i;
        for(i = 1 ; i <= 7 ; i++){
            System.out.println("Enter steps of day " + i + " : ");
            totalSteps+=ob.nextInt();
        }
        average = totalSteps / 7;
        System.out.println("Total Steps : " + totalSteps);
        System.out.println("Average steps : " + average);
    }
}
