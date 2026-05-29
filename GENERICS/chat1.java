interface P {
    int f(int x);
}
interface Q {
    String g(String s);
}
class Box<T>{
    T t;
    Box(T t){
        this.t=t;
    }
    T get(){
        return t;
    }
    void showType(){
        IO.println(t.getClass().getName());
    }
    boolean sameValue(Box<?> b){
        return t.equals(b.t);
    }
    int f(int x){
        return x+((Integer)t);
    }
    String g(T i){
        return ((String)i).toUpperCase();
    }

}
public class chat1 {
    public static void main(String[] args) {
        Box<Integer> a = new Box<Integer>(12);
        Box<String> b = new Box<>("java");
        System.out.println(a.get());
        System.out.println(b.get());
        a.showType();
        b.showType();
        System.out.println(a.sameValue(new Box<Integer>(12)));
        System.out.println(a.sameValue(new Box<Integer>(15)));
        P p = a;
        System.out.println(p.f(8));
        Q q = b;
        System.out.println(q.g("abac"));
    }
}