
class MyThread extends java.lang.Thread {

    public MyThread(String name) {
        super(name);
        setPriority(java.lang.Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        int cnt = 1;
        while (cnt <= 20) {
            System.err.println(cnt++);
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) throws Exception {
        MyThread m = new MyThread("shreyas");
        System.out.println(m.getId());
        System.err.println(m.getName());
        System.out.println(m.getPriority());
        m.start();
        System.out.println(m.getState());
        m.join();
        m.setDaemon(true);
    }
}
