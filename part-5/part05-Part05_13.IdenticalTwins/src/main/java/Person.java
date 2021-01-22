
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Person compared) {
        if (this == compared) {
            System.out.println("1");
            return true;
        }
        
        if (!(compared instanceof Person)) {
            System.out.println("2");
            return false;
        }
        
        Person comparedPerson = (Person) compared;
        
        if (this.name.equals(comparedPerson.name) &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight &&
            this.birthday.getDay() == comparedPerson.birthday.getDay() &&
            this.birthday.getMonth() == comparedPerson.birthday.getMonth() &&
            this.birthday.getYear() == comparedPerson.birthday.getYear()) {
            System.out.println("3");
            return true;
        }
        
        return false;
    }
    // implement an equals method here for checking the equality of objects
}
