
class Arithmetic {

    public static void main(String ags[]) {
        int a = 56;
        Float z = 34.24f;

        long largeNumber = 9223372036854775801L; 
        long smallNumber = -9223372036854775800L;

        long sum = largeNumber + smallNumber;
        long difference = largeNumber - smallNumber;

        float p = 12.4f;
        long k = 98l;

        System.out.println(a + z);
        System.out.println(sum + " " + difference);
        System.out.println(p*k);
    }
}
