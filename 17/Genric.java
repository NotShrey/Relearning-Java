class Dta<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }
}


public class Genric<T>{
    @SuppressWarnings("unchecked")
    T data[] = (T[]) new Object[3];
    public static void main(String[] args) {
        Genric<String> gd = new Genric<>();

        gd.data[1] = "bye";

        Dta<Integer> d = new Dta<>();

        d.setData(10);

        System.out.println(d.getData());
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}