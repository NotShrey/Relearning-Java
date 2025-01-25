public class methds{

    public static int max(int x,int y){
        if(x > y) return x;
        else return y;
    }
    public static void main(String[] args) {
        int a = 10, b = 4;

        methds mp = new methds();
        System.out.println(methds.max(a,b));
        System.out.println(mp.max(40,90));
    }
}