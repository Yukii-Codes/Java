//Result evaluation to show knowledge of if,else,else if and nested if
import java.util.*;
public class ResultEvaluation {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter name and marks");
        String name = ob.nextLine();
        int marks = ob.nextInt();
        System.out.println(" Name : " + name);
        if (marks > 0 || marks < 100){
            if(marks >= 90)
                System.out.println(" Excellent");
            else if(marks >= 70 && marks < 90)
                System.out.println(" Good");
            else if(marks >= 50 && marks < 70)
                System.out.println(" Pass");
            else
                System.out.println(" Fail");
        }
        else
            System.out.println(" Invalid marks");
    }
}
