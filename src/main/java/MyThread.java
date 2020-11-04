import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private static Counter count;
    private int maxCount = 100;

    public MyThread(Counter count) {
        MyThread.count = count;
    }

    @Override
    public void run() {
        while (Counter.getCount() < maxCount) {
            count.increase(Counter.getCount());
            logger.info("MyThread, " + Counter.getCount());
        }
    }
}
