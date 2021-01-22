
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int printing = Integer.valueOf(scanner.nextLine());
        int limit = 100;
        while (printing <= limit) {
            System.out.println(printing);
            printing++;
        }
    }
}
