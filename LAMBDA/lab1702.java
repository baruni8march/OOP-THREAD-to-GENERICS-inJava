//GENERICS USE  
interface I<T>{
    T m(T t);
}
interface G<T>{
    void m(T t);
}
class E extends Exception{

}
interface F{
    int m();
}
class A{
    static int x=10;
    int y=5;
    static void m(){
        F f=()->x*2;
        IO.println(f.m());
        x=20;
         IO.println(f.m());

    }
}
interface B{
    void m() throws E;
}


public class lab1702 {
    public static void main(String[] args) {
        I<Integer> g=(x)->x+4;
        I<String> s=(x)->x+"hi";
        IO.println(g.m(5));
        IO.println(s.m("sneha"));
        G<Integer> p=(x)->IO.println(x+10);
        p.m(7);
        // B exc=()->{IO.println("haha");throw new ArithmeticException();
        // };
         B exc=()->{IO.println("haha"); throw new E();};
         try{
           exc.m();
         }
         catch(E e){
            IO.println(e);
         }
        A.m();
        }
        
        
        
    
}
