import org.apache.log4j.Logger;

public class MyThreadRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyThreadRunnable.class);
    private Counter counter;

    public MyThreadRunnable(Counter count) {
        this.counter = count;
    }

    @Override
    public void run() {
        while (counter.getCount() < counter.getMaxCount()) {
            counter.increase();
            logger.info("MyThreadRunnable, " + counter.getCount());
        }
    }
}
