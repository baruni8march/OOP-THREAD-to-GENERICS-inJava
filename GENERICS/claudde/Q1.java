class Container<T> {
    T item;
    Container(T item) { this.item = item; }
    T get() { return item; }
}
class B<T>{
     T ob;
    B(T o){
        ob=o;
    }
     T getValue(){
        return ob;
    }
    String getInfo(){
        return "Type is "+ob.getClass().getSimpleName();
    }
}
class A<T> extends B<T>{
    A(T o){
        super(o);
    }
    T get(){
        return ob;
    }
    String getType(){
        return ob.getClass().getName();
    }
    B convert(){
         return this;
    }
}
public class Q1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln());
        
        A<Integer> a = new A<>(n);
        IO.println(a.get());
        IO.println(a.getType());
        
        B b = a.convert();
        IO.println(b.getValue());
        IO.println(b.getInfo());
    }
}