interface X {
    int val = 15;

    int add(int x);

    default String transform(String s) {
        return s.replace('x', 'y');
    }

    interface Y {
        int val = 25;

        int multiply(int x);
    }
}
class P1 implements X,X.Y{
    int val;
    P1(int x){
        val=x;
    }
   public int add(int x){
        return x+val;
    }
    public int multiply(int x){
        return x*val;
    }
    int compute(int a, int b){
        return a*b+val;
    }
    public String transform(String s) {
        return s.replace('x', 'y')+'y';
    }
}
public class TestP1 {

    static int testCounter = 1;

    static void tester(boolean b) {
        String status = "Failed";
        if (b)
            status = "Passed";
        System.out.printf("Test #%02d %s.%n", testCounter++, status);
    }

    public static void main(String[] args) {
        P1 p = new P1(10);
        // Test 1: Check instance variable + interface constants
        tester((p.val + X.val + X.Y.val) == 50);

        // Test 2: add() method via interface reference
        X x = p;
        tester(x.add(5) == 15 && x.add(20) == 30);

        // Test 3: Modify instance variable, recheck add()
        p.val += 10;
        tester(x.add(5) == 25 && x.add(20) == 40);

        // Test 4-5: Overridden default method (replace 'x'->'z' then 'z'->'y')
        tester(x.transform("xabxcd").equals("yabycdy"));
        tester(x.transform("xxmmnx").equals("yymmnyy"));

        // Test 6: multiply() via nested interface reference
        X.Y y = (X.Y) x;
        tester(y.multiply(2) == 40 && y.multiply(5) == 100);

        // Test 7: Custom method with two params: val + a*b
        tester(p.compute(5, 3) == 35 && p.compute(10, 2) == 40);

        // Test 8: Update val again
        p.val += 5;
        tester(y.multiply(3) == 75);

        // Test 9: compute with updated val
        tester(p.compute(5, 3) == 40);

        // Test 10: New object test
        tester(new P1(X.val).multiply(4) == 60);
    }
}
