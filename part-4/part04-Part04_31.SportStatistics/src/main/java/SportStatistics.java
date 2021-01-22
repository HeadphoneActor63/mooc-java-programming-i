
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            int gameCounter = 0;
            int wins = 0;
            
            while (fileReader.hasNextLine()) {            
                String game = fileReader.nextLine();
                
                if (game.contains(team)) {
                    gameCounter++;
                } else {
                    continue;
                }
                
                int teamPoints = 0;
                int opponentPoints = 0;
                
                String[] parts = game.split(",");
                
                if (team.equals(parts[0])) {
                    teamPoints = Integer.valueOf(parts[2]);
                    opponentPoints = Integer.valueOf(parts[3]);
                } else {
                    teamPoints = Integer.valueOf(parts[3]);
                    opponentPoints = Integer.valueOf(parts[2]);
                }
                
                if (teamPoints > opponentPoints) {
                    wins++;
                }
            }
            
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (gameCounter - wins));
        }
        
        catch (Exception error) {
            System.out.println("The file could not be read.");
        }
    }

}
