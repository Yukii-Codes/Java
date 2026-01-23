//Showcases use of for-each type of for loop
public class StudentMarksAnalyzer {
    public static void main (String[]args){
        int marks[]={87,95,25,68,45,78,71};
        int totalMarks=0;
        double averageMarks=0.0;
        int highestMarks=0;
        for (int x : marks){
            totalMarks+= x;
            if(x > highestMarks)
                highestMarks = x;
        }
        averageMarks =(double) totalMarks / marks.length;
        System.out.println("\nResult" +
                "\nTotal marks : " + totalMarks +
                "\nHighest marks : " + highestMarks +
                "\nAverage marks : " + averageMarks);
    }
}
