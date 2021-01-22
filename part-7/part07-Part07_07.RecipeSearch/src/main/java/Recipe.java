import java.util.ArrayList;

public class Recipe {
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int duration, ArrayList<String> ingredients) {
        this.name = name;
        this.duration = duration;
        this.ingredients = new ArrayList<>(ingredients);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
}
