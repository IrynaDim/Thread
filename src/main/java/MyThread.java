import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private Counter count;
    private int maxCount = 100;

    public MyThread(Counter count) {
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
