public class Counter {
    private static Counter counter;
    private int count;

    private Counter() {
        count = 0;
    }

    public static Counter getInstance() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increase() {
        this.count = count + 1;
    }
}

