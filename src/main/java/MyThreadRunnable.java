import org.apache.log4j.Logger;

public class MyThreadRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyThreadRunnable.class);
    private static Counter count;
    private int maxCount = 100;

    public MyThreadRunnable(Counter count) {
        MyThreadRunnable.count = count;
    }

    @Override
    public void run() {
        while (Counter.getCount() < maxCount) {
            count.increase(Counter.getCount());
            logger.info("MyThreadRunnable, " + Counter.getCount());
        }
    }
}
