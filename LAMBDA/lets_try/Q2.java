interface F{
    int m(int x);
}
class A{
    static int m(int x){return x*x*x;}
}
public class Q2{
    public static void main(String[] args){

        F f = A::m;

        IO.println(f.m(5));
    }
}