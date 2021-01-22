import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private final int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.hold.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase: this.hold) {
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.hold) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        if (this.hold.size() > 1) {
             return this.hold.size() + " suitcases (" + this.totalWeight() + " kg)"; 
        }
        
        if (this.hold.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        
        return "no suitcases (0 kg)";
    }
}
