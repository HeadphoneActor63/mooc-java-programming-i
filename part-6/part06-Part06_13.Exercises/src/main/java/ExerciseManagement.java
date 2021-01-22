import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
}
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseList = new ArrayList<>();
        for (Exercise exercise : this.exercises) {
            exerciseList.add(exercise.getName());
        }
        
        return exerciseList;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise ex: this.exercises) {
            if (exercise.equals(ex.getName())) {
                ex.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise ex: this.exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        
        return false;
    }
}
