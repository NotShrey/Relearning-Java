abstract class Super1 {

    public Super1() {
        System.out.println("Super Constructor");
    }

    public void meth1(){
        System.out.println("Meth1");
    }

    public abstract void super2();
}

class Base1 extends Super1 {

    @Override
    public void super2() {
        System.out.println("Base Implementation");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Base1 base = new Base1(); // Polymorphism: Reference of abstract class pointing to child object
        base.meth1();
        base.super2();

        Super1 s = new Base1();
        s.super2();
    }
}
