import java.util.function.*;
// interface F{int m(int i);}
public class lab1705 {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;
        IO.println(u.apply(5)); // 25
        BinaryOperator<Integer> b = (x, y) -> x + y;
        IO.println(b.apply(3, 4)); // 7
        Consumer<String> c = s -> IO.println("Hello, " + s + "!");
        c.accept("Bob"); // prints "Hello, Bob!"
        Supplier<Double> s = () -> Math.random();
        IO.println(s.get()); // Each time you run this, it will print a different random number
        Function<Integer, Integer> f = x -> x * 2;
        IO.println(f.apply(10)); // 20
        Predicate<String> p = z -> z.length() > 5;
        IO.println(p.test("Hello")); // false
    }
}