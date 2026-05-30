class A { static int m(int n) { return n*n; } 
    int m2(int n) { return n*n*2; }
    A() {}
}
class B { static <T> T m(T t) { return t; }}
interface F {int m(int n);}
interface G {int m(A a, int n);} 
interface H { A m();}
interface I<T> {T m(T t);}
public class lab1703 {
    public static void main(String[] args) {
        F f = A::m; // method reference to static method A.m(int)
        IO.println(f.m(5)); // 25
        A a = new A();
        f = a::m2; // method reference to instance method A.m2(int)
        IO.println(f.m(5)); // 50
        // f = A::m2; // incompatible types: invalid method reference
        G g = A::m2; // method reference to instance method A.m2(int) with an explicit receiver
        IO.println(g.m(new A(), 5)); // 50
        H h = A::new; // method reference to constructor A()
        IO.println(h.m()); 
        I<Integer> i = B::m;
        IO.println(i.m(5));
    }
}