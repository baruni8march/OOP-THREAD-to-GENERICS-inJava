abstract class A {
    int x;
    A(int x){ this.x = x; }
}
interface X {
    int m1();
}
class C1 extends A implements X {
    C1(int x){ super(x); }
    public int m1(){ return x + 5; }
}
class C2 extends A implements X {
    C2(int x){ super(x); }
    public int m1(){ return x * 2; }
}
public class GQ2 {
    static class Hold<T extends A & X> {
        T ob;
        Hold(T ob){ this.ob = ob; }
        int calc(){ return ob.x + ob.m1(); }
    }
    public static void main(String[] args) {
        Hold<C1> h1 = new Hold<C1>(new C1(10));
        Hold<C2> h2 = new Hold<C2>(new C2(10));
        System.out.println(h1.calc());
        System.out.println(h2.calc());
    }
}