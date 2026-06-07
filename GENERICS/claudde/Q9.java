interface Container<T> {
    void add(T item);
    T get();
}

class SimpleContainer<T> implements Container<T> {
    T item;
    public void add(T item) { this.item = item; }
    public T get() { return item; }
}

public class Q9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln());
        
        Container<Integer> c = new SimpleContainer<>();
        c.add(n);
        
        A a = new A(c);
        IO.println(a.process());
        
        B<Integer> b = new B(c);
        IO.println(b.extract());
    }
}