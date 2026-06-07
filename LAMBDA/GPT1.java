interface F {
    int m(int a, int b);
}

class Test {
    static void run(F f) {
        IO.println(f.m(4, 2));
        IO.println(f.m(5, 3));
    }
}

public class GPT1 {
    public static void main(String[] args) {
        Test.run(( a,b)->(a+1)*b);
    }
}