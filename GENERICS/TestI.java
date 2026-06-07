
interface Hold<T> {
    T get();
    void set(T t);

    default String name() {
        return "Hold";
    }

    interface Do<X> {
        X run(X x);
    }
}

abstract class NumBox<N extends Number> {
    N n;

    NumBox(N n) {
        this.n = n;
    }

    abstract int calc(N n);
}

class I<T extends Number> extends NumBox<T> implements Hold<T>, Hold.Do<String>{
    T t;
    I(T t){
       super(t);
       this.t=t;
    }
    public T get(){
        return t;
    }
    public void set(T t){
        this.t=t;
    }
    int calc(T a){

    if(a.doubleValue()==n.doubleValue()){
        return n.intValue()*2;
    }

    double ans=a.doubleValue()+n.doubleValue()+t.doubleValue();

    return (int)ans;
}
    public String name(){
        return "Hold-"+this.t;
    }
   static <X extends Number> boolean same(I<X> a,I<X> b){
        return a.n.doubleValue()==b.n.doubleValue();
    }
    static String mix(I<? extends Number> a,I<? extends Number> b){
        return a.get()+"|"+b.get();
    }
   public String run(String a){
      return a+":"+t;
    }

}
public class TestI {

    static int testCounter = 1;

    static void tester(boolean b) {
        System.out.printf("Test #%02d %s.%n",
                testCounter++, b ? "Passed" : "Failed");
    }

    static void update(Hold<? super Integer> h) {
        h.set(25);
    }

    static <X extends Number> int read(NumBox<X>  b) {
        return b.n.intValue() + b.calc(b.n);
    }

    public static void main(String[] args) {

        I<Integer> i = new I<>(5);

        tester(i.n == 5 && i.get() == 5);

        Hold<Integer> h = i;
        h.set(10);

        tester(i.n == 5 && i.get() == 10);

        update(i);

        tester(i.get() == 25);

        NumBox<Integer> nb = i;

        tester(nb.calc(3) == 33);

        tester(read(i) == 15);

        tester(h.name().equals("Hold-25"));

        Hold.Do<String> d = i;

        tester(d.run("Java").equals("Java:25"));

        I<Double> x = new I<>(2.5);

        tester(x.get().doubleValue() == 2.5 && x.calc(1.5) == 6);

        tester(I.same(new I<Integer>(5), i) == true);

        tester(I.mix(i, x).equals("25|2.5"));
    }
}