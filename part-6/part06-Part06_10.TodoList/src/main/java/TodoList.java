import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print() {
        for (String task: todoList) {
            System.out.println(todoList.indexOf(task) + 1 + ": " + task);
        }
    }
    
    public void remove(int taskNumber) {
        this.todoList.remove(taskNumber - 1);
    }
}
