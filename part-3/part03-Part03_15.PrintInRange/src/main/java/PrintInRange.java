
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit) {
                System.out.println(number);
            }
        }
    }
    
}
