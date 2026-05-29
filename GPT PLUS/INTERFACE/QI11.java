interface X {
    int a = 2;

    int m(int x);

    default int p(int x) {
        return m(x) + a;
    }

    interface Y {
        int b = 5;

        int n(int x);

        default int q(int x) {
            return n(x) + b;
        }

        interface Z {
            int c = 7;
            int r(int x);
        }
    }
}

interface W {
    default int m(int x) {
        return x * 100;
    }

    static String tag() {
        return "W";
    }
}
class A implements X, X.Y, X.Y.Z, W {
    int i;
    A(int i){
      this.i=i;
    }
    public int m(int k){
        return a+i+k;
    }
    public int n(int k){
        
    }
}

public class QI11 {
    static int tc = 1;

    static void tester(boolean b) {
        System.out.printf("Test #%02d %s.%n", tc++, b ? "Passed" : "Failed");
    }

    public static void main(String[] args) {
        A a = new A(3);
        X x = a;
        X.Y y = a;
        X.Y.Z z = a;
        W w = a;

        tester((a.i + X.a + X.Y.b + X.Y.Z.c) == 17);
        tester(x.m(4) == 9);
        tester(x.p(4) == 11);
        tester(y.n(2) == 11);
        tester(y.q(2) == 16);
        tester(z.r(3) == 19);
        tester(w.m(9) == 9);
        a.i += 2;
        tester(x.p(4) == 13);
        tester(a.r(3, 4) == 32);
        tester(W.tag().equals("W"));
    }
}