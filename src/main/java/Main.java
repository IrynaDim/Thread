public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(Counter.getInstance());
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable(Counter.getInstance());
        Thread thread = new Thread(myThreadRunnable);
        thread.start();
        myThread.start();
    }
}
