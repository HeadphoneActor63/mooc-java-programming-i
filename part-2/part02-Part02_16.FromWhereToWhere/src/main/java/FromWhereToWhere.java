
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Where to? ");
        int limit = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from? ");
        int printing = Integer.valueOf(scanner.nextLine());
        
        while (printing <= limit) {
            System.out.println(printing);
            printing++;
        }
    }
}
