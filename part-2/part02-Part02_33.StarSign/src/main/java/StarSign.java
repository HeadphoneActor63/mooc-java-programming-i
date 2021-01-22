
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int n = 1;
        while (n <= number) {
            System.out.print("*");
            if (n == number) {
                System.out.print("\n");
            }
            n++;
        }
    }

    public static void printSquare(int size) {
        for (int length = 1; length <= size; length++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int printed = 1; printed <= height; printed++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        int n = 1;
        while (n <= size) {
            printStars(n);
            n++;
        }
    }
}
