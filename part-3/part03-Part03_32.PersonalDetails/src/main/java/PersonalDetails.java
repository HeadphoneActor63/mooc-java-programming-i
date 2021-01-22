
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sumofYears = 0;
        int longest = 0;
        String longestName = "";
        
        while (true) {
            String data = scanner.nextLine();
            
            if (data.equals("")) {
                break;
            }
            
            String[] splitData = data.split(",");
            
            int nameLength = splitData[0].length();
            if (nameLength > longest) {
                longest = nameLength;
                longestName = splitData[0];
            }
            
            numbers++;
            sumofYears += Integer.valueOf(splitData[1]);
        }
        
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years:" + (double)sumofYears/numbers);
    }
}
