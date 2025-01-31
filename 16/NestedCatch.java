
public class NestedCatch {

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6};
        try {
            int c = a[1] / a[3];
            System.out.println(c);
            System.out.println(a[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException x) {
            System.out.println(x);
        }

    }
}
