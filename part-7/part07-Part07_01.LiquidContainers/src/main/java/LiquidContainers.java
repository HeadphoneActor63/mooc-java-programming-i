import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;

        while (true) {
            System.out.println("First: " + firstVolume + "/100");
            System.out.println("Second: " + secondVolume + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String parts[] = input.split(" ");            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount <= 0) {
                continue;
            }
            
            if (command.equals("add")) {
                firstVolume = firstVolume + amount;                
                if (firstVolume > 100) {
                    firstVolume = 100;
                }
            }
                
            if (command.equals("move")) {
                if (firstVolume < amount) {
                    amount = firstVolume;
                    }
                
                secondVolume += amount;
                
                if (secondVolume > 100) {
                    amount = amount - (secondVolume - 100);
                    secondVolume = 100;
                }
                
                firstVolume -= amount;
            }
                
            if (command.equals("remove")) {
                if (secondVolume < amount) {
                    secondVolume = 0;
                } else {
                    secondVolume -= amount;
                }
            }
        }
    }

}
