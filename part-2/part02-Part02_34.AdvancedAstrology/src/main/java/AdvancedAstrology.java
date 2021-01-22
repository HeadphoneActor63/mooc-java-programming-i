
public class AdvancedAstrology {

    public static void printStars(int number) {
        int starCount = 1;
        while (starCount <= number) {
            System.out.print("*");
            starCount++;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        int spaceCount = 1;
        while (spaceCount <= number) {
            System.out.print(" ");
            spaceCount++;
        }
    }

    public static void printTriangle(int size) {
        int sizeCount = 1;
        while (sizeCount <= size) {
            printSpaces(size - sizeCount);
            printStars(sizeCount);
            sizeCount++;
        }
    }

    public static void christmasTree(int height) {
        int heightCount = 1;
        while (heightCount <= height) {
            int starWidth = 2 * heightCount - 1;
            printSpaces(height - heightCount);
            printStars(starWidth);
            heightCount++;
        }
        
        heightCount = 1;
        while (heightCount <= 2) {
            printSpaces(height - 2);
            printStars(3);
            heightCount++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(4);
    }
}
