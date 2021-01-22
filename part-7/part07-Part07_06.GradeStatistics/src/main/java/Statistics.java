import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    private Grade grades;
    
    public Statistics(Grade grades) {
        this.grades = grades;
    }
    
    public int sum(ArrayList<Integer> pointList) { //works
        int sum = 0;
        for (int points: pointList) {
            sum += points;
        }
        
        return sum;
    }
    
    public double average() {
        return 1.0 * sum(this.grades.getPoints()) / this.grades.getPoints().size();
    }
    
    public double passingAverage() {
        if (this.grades.getPassingPoints().isEmpty()) {
            return 0;
        }
        return 1.0 * sum(this.grades.getPassingPoints()) / this.grades.getPassingPoints().size();
    }
    
    public double passPercentage() {
        return 100.0 * this.grades.getPassingPoints().size() / this.grades.getPoints().size();
    }
    
    public String printStars(int number) {
        String stars = "";
        for (int n = 1; n <= number; n++) {
            stars = stars + "*";
        }
        
        return stars;
    }
    
    public void gradeDistribution() {
        int grade = 5;
        this.grades.convertPoints();
        while (grade >= 0) {
            int frequency = Collections.frequency(this.grades.getGrades(), grade); //here
            System.out.println(grade + ": " + printStars(frequency));
            grade = grade - 1;
        }
    }
}
