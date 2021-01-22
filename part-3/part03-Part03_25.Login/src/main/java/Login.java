
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        boolean verification = false;
        
        if (username.equals("alex") && password.equals("sunshine")) {
            verification = true;
        }
        else if (username.equals("emma") && password.equals("haskell")) {
            verification = true;
        }
        
        if (verification) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
