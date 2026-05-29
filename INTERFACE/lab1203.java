interface A { void m(); 
    interface R { void m(); }
}
interface B { void m2(); }
interface C { void m(); }

class W implements A,A.R, B, C {
    public void m() { IO.println("m()");}
    public void m2() {IO.println("m2()");}
}

interface D extends A { void m3(); }
class X implements D {
    public void m() { IO.println("m()");}
    public void m3() { IO.println("m3()");}
}

interface E extends B, C { void m3();}
class Y implements E {
    public void m() {}
    public void m2() {}
    public void m3() {}
}

public class lab1203 {
    public static void main(String[] args) {
        A a = new W(); a.m();
        C c = new W(); c.m();
        A.R r = new W(); r.m();
    }
}