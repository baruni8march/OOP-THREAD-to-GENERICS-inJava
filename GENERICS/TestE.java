interface Store<T> {
    T get();

    void put(T t);

    default String tag() {
        return "Store";
    }

    interface Pair<X, Y> {
        String join(X x, Y y);
    }
}

abstract class Base<N extends Number> {
    N n;

    Base(N n) {
        this.n = n;
    }

    abstract double score(N n);
}
class E<T extends Number> extends Base<T extends Number> implements Store<T>,Pair<String,Integer>{
    T t;
    E(T t){
        super(t);
        this.t=t;
    }
   public T get(){
        return t;
    }
    public void put(T t){this.t=t}
    double score(T p){
        return p.doubleValue()*3+this.t.doubleValue();
    }
    String tag(){
        return super.tag()+"-"+t.toString();
    }
   public String join(String a,Integer b){
         return a+":"b.intValue()+":"+t.toString();
    }


}
public class TestE {

    static int testCounter = 1;

    static void tester(boolean b) {
        String status = "Failed";

        if(b)
            status = "Passed";

        System.out.printf("Test #%02d %s.%n", testCounter++, status);
    }

    static void update(Store<? super Integer> s) {
        s.put(30);
    }

    static double read(Base<? extends Number> b) {
        return b.n.doubleValue() + 2.5;
    }

    public static void main(String[] args) {

        E<Integer> e = new E<>(10);

        tester(e.n == 10 && e.get() == 10);

        Store<Integer> st = e;

        st.put(20);

        tester(e.get() == 20 && e.n == 10);

        update(e);

        tester(e.get() == 30);

        Base<Integer> b = e;

        tester(b.score(5) == 45.0);

        tester(read(e) == 12.5);

        tester(st.tag().equals("Store-30"));

        Store.Pair<String, Integer> p = e;

        tester(p.join("Age", 21).equals("Age:21:30"));

        E<Double> d = new E<>(4.5);

        tester(d.get().doubleValue() == 4.5 && d.score(1.5) == 10.5);

        tester(E.same(e, new E<Integer>(10)) == true);

        tester(E.mix(e, d).equals("30|4.5"));
    }
}