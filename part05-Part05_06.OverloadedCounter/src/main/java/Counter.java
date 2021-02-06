public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value += 1;
    }

    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void decrease() {
        value -= 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}
