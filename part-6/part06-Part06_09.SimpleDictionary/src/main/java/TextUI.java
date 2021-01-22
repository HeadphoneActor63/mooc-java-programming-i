import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            } 
            
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                this.dictionary.add(word, translation);
            }
            
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String translate = scanner.nextLine();
                
                String translation = this.dictionary.translate(translate);
                
                if (translation != null) {
                    System.out.println(translation);
                } else {
                    System.out.println("Word " + translate + " was not found");
                }
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
        
        System.out.println("Bye bye!");
    }
}
