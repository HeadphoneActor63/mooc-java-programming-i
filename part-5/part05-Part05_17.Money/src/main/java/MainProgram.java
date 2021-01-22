
public class MainProgram {

    public static void main(String[] args) {
        Money first = new Money(10, 0);
        Money second = new Money(7,40);
        
        Money firstMinusSecond = first.minus(second);
        System.out.println(firstMinusSecond);
    }
}
