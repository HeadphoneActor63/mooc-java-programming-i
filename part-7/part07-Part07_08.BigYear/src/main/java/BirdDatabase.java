import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdDatabase;
    
    public BirdDatabase() {
        this.birdDatabase = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        this.birdDatabase.add(new Bird(name, latinName));
    }
    
    public void observation(String observed) {
        if (!(this.isInDatabase(observed))) {
            System.out.println("Not a bird!");
        }
    }
    
    public void all() {
        for (Bird bird: this.birdDatabase) {
            System.out.println(bird);
        }
    }
    
    public void one(String name) {
        for (Bird bird: this.birdDatabase) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }
    
    public boolean isInDatabase(String observed) {
        for (Bird bird: this.birdDatabase) {
            if (bird.getName().equals(observed)) {
                bird.observed();
                return true;
            }
        } return false;
    }
}
