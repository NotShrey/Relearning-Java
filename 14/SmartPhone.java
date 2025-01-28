
class Phone {

    public void call() {
        System.out.println("Phone Call");
    }

    public void Sms() {
        System.out.println("Phone Sms");
    }
}

interface cam {

    void click();

    void record();
}

interface musicP {

    void play();

    void stop();
}

class SmartPhone1 extends Phone implements cam, musicP {

    public void videoCall() {
        System.out.println("call");
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}

public class SmartPhone {
    public static void main(String[] args) {
        SmartPhone1 s = new SmartPhone1();
        s.play();
        s.call();
        s.click();
        s.stop();
        s.Sms();
        Phone p = new SmartPhone1();
        p.Sms();
        cam c = new SmartPhone1();
        c.click();
        musicP m = new SmartPhone1();
        m.stop();
    }
}
