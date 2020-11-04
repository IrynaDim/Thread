import org.apache.log4j.Logger;

public class MyThreadRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyThreadRunnable.class);
    private static Counter count;

    public MyThreadRunnable(Counter count) {
        MyThreadRunnable.count = count;
    }

    @Override
    public void run() {
        while (Counter.getCount() < 100) {
            count.increase(Counter.getCount());
            logger.info("MyThreadRunnable, " + Counter.getCount());
        }
    }
}
