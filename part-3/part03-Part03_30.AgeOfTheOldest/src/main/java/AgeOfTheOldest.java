
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String data = scanner.nextLine();
            
            if (data.equals("")) {
                break;
            }
            
            String[] splitData = data.split(",");
            
            int age = Integer.valueOf(splitData[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
