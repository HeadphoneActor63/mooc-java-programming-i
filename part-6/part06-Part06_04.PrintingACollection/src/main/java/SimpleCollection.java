
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String printedElements = "";
        
        if (this.elements.size() > 1) {
            printedElements = " elements:\n";
        } else {
            printedElements = " element:\n";
        }
        
        for (String element: this.elements) {
            printedElements = printedElements + element;
            if (this.elements.indexOf(element) != this.elements.size() - 1) {
                printedElements = printedElements + "\n";
            }
        }
        
        return "The collection " + this.name + " has " + this.elements.size() + printedElements;
    }
}
