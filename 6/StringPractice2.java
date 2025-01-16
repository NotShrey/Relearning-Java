public class StringPractice2 {

    public static void main(String[] args) {
        
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));///true
        System.out.println(str1.startsWith("Shah" , 4));//true
        System.out.println(str1.endsWith("Khan"));//true
        System.out.println(str1.charAt(4));//S
        
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));

        
        String str2="www . udemy . co . in";
        System.out.println(str2.indexOf("."));//4
        System.out.println(str2.indexOf(".",4));//6
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.lastIndexOf("."));//17


        String s9 = "python";
        String s10 = "python";

        System.out.println(s9.equals(s10));
    }
    
}