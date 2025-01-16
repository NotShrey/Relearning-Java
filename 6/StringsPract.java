
class StringsPract {

    public static void main(String ags[]) {

        char c[] = {'a', 'b', 'c', 'd'};
        byte b[] = {65,66,67,68};

        String str1 = new String(c);
        String s2 = new String(b);
        String s3 = new String("hello");
        String s4 = "nahh";
        String s5 = new String(c,1,3);

        System.out.println("The created string is: " + str1);//abcd
        System.out.println("byte arr to string: "+ s2);//ABCD
        System.out.println("String to string: "+ s3); //hello
        System.out.println("String to string: "+ s4); //nahh
        System.out.println("String to string: "+ s5); //bcd

        String s10 = "jaava";
        String s11 = "jaava";

        System.out.println(s10 == s11);//True


        String s12 = new String("jaava"); 
        System.out.println(s10 == s12);//false



        String s13 = "this is working";
        String op = s13.toUpperCase();
        System.out.println(op);


        String s19 = "      WElcome      ";
        System.out.println(s19.trim());

        System.out.println(s13.substring(3, 13));
        System.out.println(s13.replace("i", "z"));
    }
}
