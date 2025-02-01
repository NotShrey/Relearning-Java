
public class LangPack{
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();

        System.out.println(o.equals(o1));
        System.out.println(o1.hashCode());

        Integer a = Integer.valueOf(10);
        System.out.println(a);

        float g = 12.4f;
        Float h = Float.valueOf(g);

        Float z = Float.valueOf("23.5");
        float v = z.floatValue();
        float u = v;
    }
}