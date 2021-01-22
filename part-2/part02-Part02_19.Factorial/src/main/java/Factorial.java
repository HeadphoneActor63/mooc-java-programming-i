
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        
        int number = 1;
        int factorial = 1;
        
        while (number <= end) {
            factorial *= number;
            number++;
        }
        System.out.println("Factorial:" + factorial);
    }
}
