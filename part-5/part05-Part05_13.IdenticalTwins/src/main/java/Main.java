
public class Main {
    
    public static void main(String[] args) {
        SimpleDate birthday = new SimpleDate(2, 4, 2000);
        Person jamie = new Person("Jamie", birthday, 150, 40);
        Potato leslie = new Potato("Jamie", birthday, 150, 40);
        
        System.out.println(jamie.equals(leslie));
    }
        
}
