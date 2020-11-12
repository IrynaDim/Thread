import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private Counter counter;

    public MyThread(Counter count) {
        this.counter = count;
    }

    @Override
    public void run() {
        while (counter.getCount() < counter.getMaxCount()) {
            counter.increase();
            logger.info("MyThread, " + counter.getCount());
        }
    }
}
