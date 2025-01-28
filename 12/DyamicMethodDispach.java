
class super1 {

    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }
}

class base1 extends super1 {

    @Override
    public void meth2() {
        System.out.println("Base2");
    }

    public void meth3() {
        System.out.println("base3");
    }

}

public class DyamicMethodDispach {

    public static void main(String[] args) {
        super1 s = new base1();

        s.meth1();
        s.meth2();

        System.out.println("-----------");

        base1 b = new base1();

        b.meth1();
        b.meth2();
        b.meth3();

    }
}
