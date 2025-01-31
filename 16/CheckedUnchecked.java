class Lowbal extends Exception{
    @Override
    public String toString(){
        return "Bal is low mf";
    }
}

class Unchecked{
    static void fun1(){
        try {
            throw new Lowbal();
        } catch (Lowbal e) {
            System.out.println(e);
        }
    }
}




public class CheckedUnchecked {
    public static void main(String[] args) {
        Unchecked u = new Unchecked();
        u.fun1();
    }
}
