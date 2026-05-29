interface B{
    int p=3;
    int f(int x);
    static String tag(String s) {
        return s.toUpperCase()+"-"+p;

    }
    interface C {
        int q=5;
        int g(int x);
        interface D{
          int r=7;
          int h(int x);
        }
    }
}


class A implements B, B.C, B.C.D {
    int i;

    A(int i) {
        this.i = i;
    }

    public int f(int x) {
        return i + x + B.p;
    }

    public int g(int x) {
        return i * x + B.C.q;
    }

    public int h(int x) {
        return i + x * x + B.C.D.r;
    }
}

public class QI2 {
    public static void main(String[] args) {
        A a = new A(4);
        B b = a;
        B.C c = a;
        B.C.D d = a;

        System.out.println(B.p + B.C.q + B.C.D.r);
        System.out.println(b.f(2));
        System.out.println(c.g(3));
        System.out.println(d.h(5));
        System.out.println(B.tag("ab"));
    }
}