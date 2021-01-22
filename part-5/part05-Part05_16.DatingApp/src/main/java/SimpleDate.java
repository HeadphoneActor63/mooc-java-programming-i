
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate clone() {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        return clone;
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = clone();
        newDate.advance(days);
        return newDate;
    }
    
    public void advance(int howManyDays) {
        while (howManyDays != 0) {
            if (this.day == 30) {
                this.day = 1;
                
                if (this.month ==12) {
                    this.month = 1;
                    this.year++;
                } else {
                    this.month++;
                }
                
                howManyDays = howManyDays - 1;
                
            } else {
                int difference = 30 - this.day;
                
                if (howManyDays < difference) {
                    this.day = this.day + howManyDays;
                    howManyDays = 0;
                } else {
                    this.day = this.day + difference;
                    howManyDays = howManyDays - difference;
                }
            }
        }
    }
    
    public void advance() {
        this.advance(1);
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
