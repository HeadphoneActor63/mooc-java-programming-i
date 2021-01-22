
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestPerson = "";
        
        while (true) {
            String data = scanner.nextLine();
            
            if (data.equals("")) {
                break;
            }
            
            String[] splitData = data.split(",");
            
            int age = Integer.valueOf(splitData[1]);
            if (age > oldest) {
                oldest = age;
                oldestPerson = splitData[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
