
interface Test{
    void m1();
    void m2();
}

class Test2 implements Test{
    @Override
    public void m1(){
        System.out.println("m1");
    }
    @Override
    public void m2(){
        System.out.println("m2");
    }
}


public class InterFaces {
    public static void main(String[] args) {
        Test t = new Test2();

        t.m1();
        t.m2();
    }
}
