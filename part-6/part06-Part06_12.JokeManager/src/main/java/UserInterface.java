import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String input = scanner.nextLine();
                this.jokes.addJoke(input);
            } else if (command.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if (command.equals("3")) {
                this.jokes.printJokes();
            }
        }
    }
}
