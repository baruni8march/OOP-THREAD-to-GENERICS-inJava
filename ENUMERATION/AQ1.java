enum A{
    B(5),C(2),D(7);
    
    int i;
    A(int x){
        this.i=x;
        IO.println("A cons "+x);
    }
    static{
        IO.println("static A");
    }
    int m(int a){
       return (i+5)*a;
    }
    int get(){
        return i;
    }
}
public class AQ1{
    public static void main(String[] args){
        IO.println("main");

        A x = A.C;
        IO.println(x.m(3));

        for(A a : A.values()){
            IO.println(a + ":" + a.ordinal() + ":" + a.get());
        }
    }
}