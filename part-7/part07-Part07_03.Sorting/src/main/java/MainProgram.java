
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int smallestIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                smallestIndex = i;
                break;
            }
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] table, int index1, int index2) {
        int helper = table[index1];
        table[index1] = table[index2];
        table[index2] = helper;
    }
    
    public static void sort(int[] array) {
        int i = 0;
        
        while (i < array.length) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            i++;
        }
    }
}
