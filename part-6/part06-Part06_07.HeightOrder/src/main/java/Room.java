import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public Person shortest() {        
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for (Person person: this.room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;      
    }
          
    public Person take() {
        Person removed = this.shortest();
        this.room.remove(removed);
        return removed;
    }
    
    public boolean isEmpty() {
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
}
