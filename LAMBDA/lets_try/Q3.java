interface F{
    int m(A a,int n);
}
class A{
    static int square(A a,int n){
        return n*10;
    }
}
public class Q3{

    public static void main(String[] args){

        F f = A::square;

        IO.println(f.m(new A(),5));
    }
}