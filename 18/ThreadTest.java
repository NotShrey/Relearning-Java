// class MyRun implements Thread{
//     public void run() {
//         int i = 1;
//         while (i <= 20) {
//             System.out.println(i + " Run");
//             i++;
//         }
//     }
// }


class MyThread extends java.lang.Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i + " Yelo");
            i++;
        }
    }
}

public class ThreadTest extends java.lang.Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i + " Mid");
            i++;
        }
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        ThreadTest t = new ThreadTest();
        t.start();

        // MyRun m = new MyRun();
        // Thread th = new Thread(m);
        // th.start();

        int i = 1;
        while (i <= 20) {
            System.out.println(i + " Wrld");
            i++;
        }
    }
}
