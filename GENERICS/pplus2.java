class Pair<T ,V>{
    T t; 
    V v;
    Pair(T t,V v){
        this.t=t;
        this.v=v;

    }
    T first(){
        return t;
    }
    V second(){
        return v;
    }
    void showTypes(){
        IO.println(t.getClass().getName());
        IO.println(v.getClass().getName());
    }
}
public class pplus2 {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(10, "OOP");

        System.out.println(p.first());
        System.out.println(p.second());
        p.showTypes();
    }
}