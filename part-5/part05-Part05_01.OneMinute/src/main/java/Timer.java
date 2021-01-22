public class Timer {
    private ClockHand seconds;
    private ClockHand centiSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.centiSeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.centiSeconds.advance();
        
        if (this.centiSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds.toString() + ":" + this.centiSeconds.toString();
    }
}
