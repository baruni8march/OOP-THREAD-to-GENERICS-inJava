interface Func<T>{
    T apply(T t);
}

class Helper{
    static <T> T id(T t){
        return t;
    }

    static <T extends Number> double twice(T t){
        return t.doubleValue() * 2;
    }
}

class Box<T extends Number>{
    T ob;
    Box(T ob){ this.ob = ob; }

    double val(){
        return ob.doubleValue();
    }

    boolean same(Box<?> b){
        return val() == b.val();
    }
}

public class plus2{
    static <T> T run(Func<T> f, T v){
        return f.apply(v);
    }

    public static void main(String[] args){
        int k = 5;

        Func<String> f1 = s -> s + k;
        System.out.println(run(f1, "A"));

        Func<Integer> f2 = n -> n * n + k;
        System.out.println(run(f2, 3));

        Box<Integer> b1 = new Box<>(10);
        Box<Double> b2 = new Box<>(10.0);

        System.out.println(b1.same(b2));
        System.out.println(Helper.id("X") + Helper.twice(2));
    }
}