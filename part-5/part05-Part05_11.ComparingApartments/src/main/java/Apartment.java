
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (compared.squares > this.squares) {
            return false;
        }
        
        if (compared.squares < this.squares) {
            return true;
        }
        
        return false;
    }
    
    public int getPrice() {
        return this.pricePerSquare * this.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDifference = this.getPrice() - compared.getPrice();
        
        if (priceDifference < 0) {
            return priceDifference * -1;
        } else {
            return priceDifference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

}
