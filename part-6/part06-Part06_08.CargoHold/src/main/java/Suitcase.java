import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private final int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.suitcase.add(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.suitcase.get(0);
        
        for (Item item: this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item: this.suitcase) {
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Item item: suitcase) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcase.size() > 1) {
             return this.suitcase.size() + " items (" + this.totalWeight() + " kg)"; 
        }
        
        if (this.suitcase.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return "no items (0 kg)";
    }
}
