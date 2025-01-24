public class TwoD {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

        int b[][] = {{1, 2, 3}, {4, 5, 6}, {1, 3, 5}};

        int c[][];
        c = new int[2][2];
        
        for (int[] b1 : b) {
            for (int b2 : b1) {
                System.out.print(b2);
            }
            System.out.println(" ");
        }
    }
}
