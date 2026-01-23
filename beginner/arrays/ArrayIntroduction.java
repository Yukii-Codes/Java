//Showcase of initialization declaration and scanning in 1d and 2d array
import java.util.*;
public class ArrayIntroduction {
    public static void main(String [] args) {
        Scanner ob = new Scanner(System.in);
        int rollNo[] = {10, 11, 12};
        int marks[][] = {
                {80, 85, 65},
                {88, 59, 95},
                {98, 52, 46}
    };
        System.out.println("Roll numbers : ");
        for(int roll : rollNo){
            System.out.print(roll + " ");
        }
        System.out.println("\n\nMarks of Students : ");
        for (int i = 0 ; i < marks.length ; i++){
            System.out.print("Student " + (i + 1) + " : ");
            for (int j = 0 ; j< marks[i].length ; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
