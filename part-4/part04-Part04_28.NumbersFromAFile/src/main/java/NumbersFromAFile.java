
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int validNumbers = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                
                if (number>= lowerBound && number <= upperBound) {
                    validNumbers++;
                }
            }
            
            System.out.println("Numbers: " + validNumbers);
        }
        
        catch (Exception error) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
