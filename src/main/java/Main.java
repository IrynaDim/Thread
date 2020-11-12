public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread myThread = new MyThread(count);
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable(count);
        Thread thread = new Thread(myThreadRunnable);
        thread.start();
        myThread.start();
    }
}
