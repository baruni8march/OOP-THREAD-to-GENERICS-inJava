class Container<T> {
    T item;
    Container(T item) { this.item = item; }
    T get() { return item; }
    void set(T item) { this.item = item; }
}
class A<T extends Number> extends Container<T>{
    
    A(T o){
        super(o);
    }

}
public class B {
    public static void print(Container<? extends Number> c) {
        Number n = c.get();
        IO.println(n.doubleValue());
    }
    public static void fill(Container<? super Integer> c) {
        c.set(100);
    }
}

public class Q3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln());
        A<Integer> a1 = new A<>(n);
        B.print(a1);
        A<Integer> a2 = new A<>(0);
        B.fill(a2);
        IO.println(a2.get());
        Container<Number> cn = new Container<>(45.5);
        B.print(cn);
        B.fill(cn);
    }
}