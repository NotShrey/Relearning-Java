public class VarArgs {
    public static void Solve(int... a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Solve(1, 2, 3, 4, 5, 6); 
    }
}
