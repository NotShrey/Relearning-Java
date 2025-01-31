public class Throws {

    static int area(int l, int b)throws Exception {
        if(l<0 || b<0) throw new Exception();
        return l*b;
    }

    static void meth1(){
        try{
            System.out.println(area(-9,5));
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Working");
        }
    }
    public static void main(String[] args) {
        meth1();
    }
}
