
class MyData {

    public void display(String s) {
        synchronized (this) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
}

class MyThread1 extends java.lang.Thread {

    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Wlecome ");
    }

}

class MyThread2 extends java.lang.Thread {

    MyData d;

    public MyThread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Heloo");
    }

}

public class Synch {

    public static void main(String[] args) {
        MyData d = new MyData();

        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
