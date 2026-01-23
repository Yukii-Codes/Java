//Showcases typecasting and conversion to ASCII value
public class BasicOperations {
    public static void main(String [] args){
        int number = 20;
        System.out.println(" Number : " + number);
        double implicit = number;
        System.out.println(" Number after implicit conversion : " + implicit);
        double number2 = 25.69;
        System.out.println(" Number : " + number2);
        int explicit = (int) number2;
        System.out.println(" Number after explicit conversion : " + explicit);
        char character = 'F';
        System.out.println(" Character : " + character);
        int ASCII = character;
        System.out.println(" ASCII value of character : " + ASCII);
    }
}
