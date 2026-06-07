import java.util.Arrays;
public class B<T extends Number> {
    T value;
    B(T value) { this.value = value; }
    public double getValue() { return value.doubleValue(); }
    public B.C m() { return new C(); }
    class C {
        String info() { return value.getClass().getName(); }
    }
}
class A<T extends Number>{
    T ob;
    A(T o){
       ob=o;
    }
    double process(){
        return ob.doubleValue();
    }
}
public class Q1 {
    public static void main(String[] args) {
        int[] nums = Arrays.stream(IO.readln().split(" ")).mapToInt(Integer::parseInt).toArray();
        A<Integer> a1 = new A<>(nums[0]);
        A<Double> a2 = new A<>(nums[1] * 1.5);
        IO.println(a1.process());
        IO.println(a2.process());
        B<Integer> b1 = new B<>(nums[0]);
        B<Double> b2 = new B<>(nums[1] * 1.5);
        IO.println(b1.m().info());
        IO.println(b2.m().info());
        A<? extends Number> aany = a1;
        IO.println(aany.process());
    }
}