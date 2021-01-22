
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doubles = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean booleans = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubles);
        System.out.println("You gave the boolean " + booleans);
    }
}
