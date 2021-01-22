import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> passedPoints;
    private ArrayList<Integer> grades;
    
    public Grade() { //works
        this.allPoints = new ArrayList<>();
        this.passedPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void add(int points) { //works
        this.allPoints.add(points);
        
        if (points >= 50) {
            this.passedPoints.add(points);
        }
    }
    
    public void convertPoints() {
        for (int points: this.allPoints) {
            int grade = pointsToGrade(points);
            this.grades.add(grade); //here
        }
    }
    
    public ArrayList<Integer> getPoints() { //works
        return this.allPoints;
    }
    
    public ArrayList<Integer> getPassingPoints() {
        return this.passedPoints;
    }
    
    public ArrayList<Integer> getGrades() { //works
        return this.grades;
    }
    
    public int pointsToGrade(int point) { //works
        if (point < 50) {
            return 0;
        } else if (point < 60) {
            return 1;
        } else if (point < 70) {
            return 2;
        } else if (point < 80) {
            return 3;
        } else if (point < 90) {
            return 4;
        }
        
        return 5;
    }
}
