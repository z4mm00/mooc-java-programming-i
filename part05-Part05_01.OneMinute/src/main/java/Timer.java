public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfaSec;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfaSec = new ClockHand(100);
    }

    public void advance() {
        this.hundredthsOfaSec.advance();
        if (this.hundredthsOfaSec.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsOfaSec;
    }
}
