
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();
        
        while (true) {
            System.out.print("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                
                birdDatabase.add(name, latinName);
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String observed = scan.nextLine();
                
                birdDatabase.observation(observed);
            }
            
            if (command.equals("All")) {
                birdDatabase.all();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                
                birdDatabase.one(bird);
            }
        }

    }

}
