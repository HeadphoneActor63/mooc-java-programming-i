import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title:");
            String title = scanner.nextLine();
            System.out.println(title);
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year:");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        
        if (input.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
