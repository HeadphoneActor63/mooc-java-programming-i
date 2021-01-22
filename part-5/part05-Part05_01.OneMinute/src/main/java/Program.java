
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        int i = 0;
        Timer myTimer = new Timer();
        
        while (i < 6000) {
            myTimer.advance();
            i++;
        }
        
        System.out.println(myTimer);
    }
}
