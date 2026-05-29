interface A {void m();}
interface B {    
    // static void m(); //error: missing method body, or declare abstract
    static void m() {IO.println("B.m()");
        psm();
        // pm(); // error: non-static method pm() cannot be referenced from a static context
    }
    // private void pm(); //error: missing method body, or declare abstract
    default void dm() {pm();}
    private void pm() {IO.println("B.pm()"); }
    private static void psm() {IO.println("B.psm()"); }
}
interface D{ void md();}
interface C extends B,D {}
class X implements B {
    void m2() { //pm(); //error: cannot find symbol

    }
}
class Y implements C {
    public void md() {IO.println("Y.md()");}
}
public class lab1301 {
    public static void main(String[] args) {
        A a;
        // a = new A(); cannot be instantiated
        a = new A() { //similar to anonymous class extending A and implementing method m() like class Ann extends A{void m(){....}}
            public void m() {IO.println("Anno.m()");}
        };
        a.m();
        B.m();
        // C.m(); // error: cannot find symbol
        // X.m(); //error: cannot find symbol // classes inherit default methods,static variables but not static,private methods
        // B.pm(); //error: pm() has private access in B
        B b = new Y();
        // b.md(); //error: cannot find symbol //B must have a method md()
        D d = (D)b;
        d.md();


    }
}