public class Counter {
    private static Counter instance;
    private static int count;

    private Counter() {
    }

    public void increase(int count) {
        Counter.count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
            count = 0;
        }
        return instance;
    }
}
