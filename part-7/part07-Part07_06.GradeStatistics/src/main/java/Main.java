import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade myGrades = new Grade();
        Statistics statistics = new Statistics(myGrades);
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            if (point >= 0 && point <= 100) {
                myGrades.add(point);
            }
        }
 
        System.out.println("Point average (all): " + statistics.average());
        
        if (statistics.passingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + statistics.passingAverage());
        }
        
        System.out.println("Pass percentage: " + statistics.passPercentage());
        
        System.out.println("Grade distribution:");
        statistics.gradeDistribution();
    }
}