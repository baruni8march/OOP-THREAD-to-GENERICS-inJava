interface F{ int m(); }
interface F2{ double m(); }
interface G{ boolean m(int n); }
interface H{int m(int i, int j);}
public class lab17 {
    public static void main(String[] args) {
        
        // F f = () -> 100;
        // IO.println(f.m());
        // // f = () -> "Hello"; // error: incompatible types: bad return type in lambda expression
       // F f = () -> (long long)120; error 
         F f=()->(short)120;// no prob widening conversion
         IO.println(f.m());
        // F2 f2 = () -> 3.14;
        // IO.println(f2.m());
        // f2 = () -> Math.random();
        // IO.println(f2.m());
        // G g = (n) -> n % 2 == 0;
        // IO.println(g.m(10)); // true
        // IO.println(g.m(15)); // false
        // G g2 = n -> n > 0;
        // IO.println(g2.m(5)); // true
        // IO.println(g2.m(-3)); // false
        // G g3 = (int n) -> n % 3 == 0;
        // IO.println(g3.m(9)); // true
        H h = (i, j) -> i + j;
        IO.println(h.m(3, 4)); // 7
        // h = (int i, j) -> i + j;
        // h = (i, int j) -> i + j; //invalid lambda parameter declaration (cannot mix implicitly-typed and explicitly-typed parameters)
        H h2 = (i, j) -> {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += k;
            }
            return sum;
        };
        IO.println(h2.m(1, 5));
    }    
}