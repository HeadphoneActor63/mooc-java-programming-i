
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] splitRow = row.split(",");
                
                int age = Integer.valueOf(splitRow[1]);
                
                if (age != 1) {
                    System.out.println(splitRow[0] + ", age: " + age + " years");
                } else {
                    System.out.println(splitRow[0] + ", age: " + age + " year");
                }
            }
        }
        
        catch (Exception error) {
            System.out.println("The file cannot be read.");
        }
    }
}
