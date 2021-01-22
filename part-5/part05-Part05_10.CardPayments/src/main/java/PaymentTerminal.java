
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }
    
    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.money = this.money + 2.50;
            affordableMeals++;
            return payment - 2.50;
        } else {
            return payment;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }
    
    public boolean eatAffordably(PaymentCard card) {
         boolean wasSuccessful = card.takeMoney(2.50);
         if (wasSuccessful) {
            affordableMeals++;
        }
         return wasSuccessful;
    }
    
    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.money = this.money + 4.30;
            heartyMeals++;
            return payment - 4.30;
        } else {
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean wasSuccessful = card.takeMoney(4.30);
        if (wasSuccessful) {
            heartyMeals++;
        }
        return wasSuccessful;
    }    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
