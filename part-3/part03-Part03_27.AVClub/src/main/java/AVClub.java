
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String text = scanner.nextLine();
            String[] splitText = text.split(" ");
            
            if (text.equals("")) {
                break;
            }
        
            for (String word: splitText) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
