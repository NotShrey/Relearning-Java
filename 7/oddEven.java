import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        System.err.println(a%2 == 0 ? "TRUE" : "Fls");
        sc.close();
    }
}
