//type intersection:eksathe multiple bounded type
class A{}
interface X{}
interface Y{}
class B extends A{}
class C implements X{}
class D extends A implements X{}
class E implements X,Y{}

class GA<T extends A & X>{ //you cannot extend two classes at the same time so extending one interface and one class is alright class GA<T extends A & B> is error
//also : class GA<T extends X & A> is error because class must be at first



}
class GB<T extends X & Y>{} //alright because interface er khetre age pore matter korena
 
//homework:wildcard

class M{ //generic methods of non generic class
    public <T> void m(){}
    public <T> void m(T t){}
    public <T> T m2(T t){ return t;}
    public <V> void m3(V t){}
    //public <T> void m(T t){} wrong 
    public <T> void m(T[] t){}
    public <T,V> void m(T t,V v){}
     
    //generic constructor is possible 
    // <T>M(T t){

    // }
    //tokhon main a M a=new M<Integer>();
}

public class lab1605 {
    
    public static void main(String[] args) {
      GA<D> ga=new GA<D>(); //alright
    //   GA<B> ga=new GA<B>(); //wrong because B extends A but doesnt implement X
    //   GA<C> ga=new GA<C>(); //wrong because C implements X but didnt extend A
    GB<E> gb=new GB<E>(); //alright because E implements X and Y
      

    M a=new M();
    a.m();
    a.<Integer>m();
    a.<Integer>m(10);
    //a.m(10); o hobe argument theke infer kore nibe
    a.m(10,"hello");
    a.m(10,2.3);

    }
}
