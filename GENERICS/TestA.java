interface Tool<T extends Number> {
    int k = 7;

    T get();

    int calc(T t);

    default String change(String s) {
        return s.replace('e', 'x') + ":" + k;
    }

    interface Maker<U> {
        U make(U u);

        int len(U u);
    }
}
class A<T extends Number> implements Tool<T>, Tool.Maker<String> {

    T x;

    A(T x) {
        this.x = x;
    }

    public T get() {
        return x;
    }

    public T getValue() {
        return x;
    }

    public int calc(T t) {
        return t.intValue() + x.intValue() + k;
    }

    public String make(String u) {
        return u + "#" + x.intValue();
    }

    public int len(String u) {
        return u.length() * x.intValue() - 20;
    }

    static <E extends Number> boolean same(A<E> a1, A<E> a2) {
        return a1.x.doubleValue() == a2.x.doubleValue();
    }

    int total(Integer[] a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum + x.intValue();
    }

    String name() {
        return x.getClass().getName() + ":" + x.intValue();
    }
}
public class TestA {

    static int testCounter = 1;

    static void tester(boolean b) {
        String status = "Failed";

        if(b)
            status = "Passed";

        System.out.printf("Test #%02d %s.%n", testCounter++, status);
    }

    public static void main(String[] args) {

        A<Integer> a = new A<>(5);

        tester((a.x + Tool.k) == 12);

        Tool<Integer> t = a;

        tester(t.get() == 5 && t.calc(10) == 22);

        a.x += 3;

        tester(t.get() == 8 && t.calc(10) == 25);

        tester(t.change("level").equals("lxvxl:7"));

        Tool.Maker<String> m = a;

        tester(m.make("oop").equals("oop#8") && m.len("java") == 12);

        A<Double> d = new A<>(2.5);

        tester(d.getValue().doubleValue() == 2.5 && d.calc(10) == 19);

        tester(A.same(a, new A<Integer>(8)) == true);

        tester(A.same(a, new A<Integer>(9)) == false);

        tester(a.total(new Integer[]{1, 2, 3}) == 14);

        tester(d.name().equals("java.lang.Double:2"));
    }
}