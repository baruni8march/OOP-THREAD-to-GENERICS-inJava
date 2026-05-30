interface I<T> {void m(T t);}
class E extends Exception { E() { super("Exception:E"); } }
// interface F{void m() throws E;}
interface F{int m();}
class A {
    static int x = 10;
    int y = 5;
    static void m() {
        F f = () -> x * 2; // captures the local variable x
        IO.println(f.m()); // 20
        x = 20; 
        IO.println(f.m()); // 40
    }
    void m2() {
        F f = () -> y * 2; // captures the instance variable y
        IO.println(f.m()); // 10
        y = 10; 
        IO.println(f.m()); // 20
    }
}
class B {
    static void m() {
        int x = 10; // local variable
        F f = () -> x * 2; // captures the local variable x
        IO.println(f.m()); // 20
        // x = 20; // local variables referenced from a lambda expression must be final or effectively final
        // IO.println(f.m()); // 40
    }
}
public class lab1702 {
    public static void main(String[] args) {
        // I<String> i = s -> IO.println("Hello, " + s + "!");
        // i.m("Alice"); // prints "Hello, Alice!"
        // I<Integer> i2 = n -> IO.println("The number is: " + n);
        // i2.m(42); // prints "The number is: 42"
        // F f = () -> { throw new E(); };
        // try {
        //     f.m();
        // } catch (E e) {
        //     IO.println(e.getMessage()); // prints "Exception:E"
        // }
        // f = () -> { throw new ArithmeticException(); };
        // f = () -> { throw new Exception(); }; //error: unreported exception Exception; must be caught or declared to be thrown
        A.m();
        A a = new A();
        a.m2();
        B.m();
    }
}