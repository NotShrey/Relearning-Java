
class Yest{
    static int x = 10;
    int y = 20;

    void show(){
        System.out.println(x + " " + y);
    }

    static void show1(){
        System.out.println(x);
    }
}

public class Satic {

    public static void main(String[] args) {
        Yest y = new Yest();
        y.show();
        
        y.x = 50;
        y.y = 100;
        Yest.show1();
    }
}
