import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                stop();
                break;
            }
            
            if (command.equals("add")) {
                add();
            }
            
            if (command.equals("list")) {
                list();
            }
            
            if (command.equals("remove")) {
                remove();
            }
        }
    }
    
    public boolean stop() {
        return false;
    }
    
    public void add() {
        System.out.println("To add:");
        String toAdd = scanner.nextLine();
        
        this.todoList.add(toAdd);
    }
    
    public void list() {
        this.todoList.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int toRemove = Integer.valueOf(scanner.nextLine());
        
        this.todoList.remove(toRemove);
    }
}
