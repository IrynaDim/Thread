import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private static Counter count;

    public MyThread(Counter count) {
        MyThread.count = count;
    }

    @Override
    public void run() {
        while (Counter.getCount() < 100) {
            count.increase(Counter.getCount());
            logger.info("MyThread, " + Counter.getCount());
        }
    }
}
