import org.apache.log4j.Logger;

public class MyThreadRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyThreadRunnable.class);
    private Counter count;
    private int maxCount = 100;

    public MyThreadRunnable(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (count.getCount() < maxCount) {
            count.increase();
            logger.info("MyThread, " + count.getCount());
        }
    }
}
