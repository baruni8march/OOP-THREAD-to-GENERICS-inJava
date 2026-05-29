interface A {
    void m();
    interface B { // by default public
        void m2();
    }
    // private interface G {} // error: illegal combination of modifiers: public and private
    // static void m4(); //error: missing method body, or declare abstract
}

// final interface X {} // error: illegal combination of modifiers: interface and final

class R implements A {
    public void m() {}
}
// class T implements B {} // error: cannot find symbol
class T implements A.B { public void m2() {}} 

class C { 
    private interface Y {}
    public interface Z {}
}
// class D implements C.Y {} // error: Y has private access in C
class Q implements C.Z {}
public class lab1202 {
    public static void main(String[] args) {
        A a = new R(); a.m();
        C.Z z = new Q();
    }
}