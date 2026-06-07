abstract class Parent<T extends Number> {
    T n;

    Parent(T n) {
        this.n = n;
    }

    abstract double value(T t);
}

interface Job<X> {
    int p = 4;

    X get();

    default int f(int x) {
        return x + p;
    }

    interface In<Y> {
        Y work(Y y);
    }
}
class B<T extends Number,V> extends Parent<T> implements Job<String>{
V s;
    B(T t,V v){
        super(t);    
        s=v;
    }
    double value(T t){
        return n.doubleValue()+10.0;
    }
   public String get(){
        return s+n+"";
    }
    class C<T extends Number>{
       T keep;
       C(T p){
          keep=p;
       }
       T work(C<?> q){

       }
    }
    double add(B a,B b){
        return a.n.doubleValue()+b.n.doubleValue();
    }
    String code(){
        return "B-"+n.getClass().getName()+"-"+s;
    }
}

public class TestB {

    static int testCounter = 1;

    static void tester(boolean b) {
        String status = "Failed";

        if(b)
            status = "Passed";

        System.out.printf("Test #%02d %s.%n", testCounter++, status);
    }

    static double checkOne(Parent<? extends Number> p) {
        return p.n.doubleValue() + 1.5;
    }

    static void checkTwo(Job<? super String> j) {
        tester(j.f(6) == 10);
    }

    public static void main(String[] args) {

        B<Integer, String> b = new B<>(6, "ab");

        tester(b.n == 6 && b.s.equals("ab") && Job.p == 4);

        Parent<Integer> p = b;

        tester(p.value(10) == 20.0 && p.value(2) == 12.0);

        Job<String> j = b;

        tester(j.get().equals("ab6") && j.f(3) == 7);

        checkTwo(b);

        B<Integer, String>.C<Double> c = b.new C<>(2.5);

        tester(c.keep == 2.5 && c.work(1.5) == 7.5);

        B<Integer, String>.C<Integer> c2 = b.new C<>(20);

        tester(c2.keep == 20 && c2.work(5) == 11);

        B<Double, String> d = new B<>(3.5, "xy");

        tester(d.value(1.5) == 9.0 && d.get().equals("xy3.5"));

        tester(B.add(b, d) == 9.5);

        tester(checkOne(d) == 5.0);

        tester(d.code().equals("B-java.lang.Double-xy"));
    }
}