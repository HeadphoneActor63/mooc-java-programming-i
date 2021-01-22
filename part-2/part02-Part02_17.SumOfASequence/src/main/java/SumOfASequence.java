
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        int number = 1;
        int sum = 0;
        
        while (number <= end) {
            sum += number;
            number++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
