
class MyData {

    int val;
    boolean f = true;

    synchronized public void set(int v) {
        while (f != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        val = v;
        f = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (f != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        x = val;
        f = true;
        notify();

        return x;
    }
}

class Produce extends java.lang.Thread {

    MyData data;

    public Produce(MyData d) {
        data = d;
    }

    public void run() {
        int cnt = 1;
        while (true) {
            data.set(cnt);
            System.out.println("Data: " + cnt);
            cnt++;
        }
    }
}

class Consume extends java.lang.Thread {

    MyData data;

    public Consume(MyData d) {
        data = d;
    }

    public void run() {
        int val;
        while (true) {
            val = data.get();
            System.out.println("Data: " + val);
        }
    }
}

public class interP {

    public static void main(String[] args) {
        MyData d = new MyData();

        Produce p = new Produce(d);
        Consume c = new Consume(d);

        p.start();
        c.start();
    }
}
