public class test5 {

    public static void main(String[] args) {
        int b[][] = {{1, 2, 3}, {4, 5, 6}, {1, 3, 5}};
        int c[][] = {{4, 5, 6}, {1, 2, 3}, {0, 9, 8}};
    
        for (int i = 0; i < b.length; i++) { 
            for (int j = 0; j < b[i].length; j++) { 
                System.out.print(b[i][j] + c[i][j] +" "); 
            }
            System.out.println(" ");
        }
    }
}
