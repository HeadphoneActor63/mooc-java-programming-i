
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            String text = scanner.nextLine();
            String[] splitText = text.split(" ");
            
            if (text.equals("")) {
                break;
            }
        
            for (String word: splitText) {
                System.out.println(word);
            }
        }
    }
}
