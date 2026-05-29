class A<T>{
   // static T s; T type parameter is non static so we cannot use static
   //also static T m(){..} wrong as return type T
    T t;
    T[] arr;
    A(T t){
        this.t=t;
    }
    T get(){
       return t;
    }
    void m(){
        IO.println("T:"+t.getClass().getName());
    }
    // void m3(){
    //     T[] ta=new T[10]; //generic a array te value assign kora jayna
    // }
}
class B{
public String toString(){
    return "sneha";// otherwise B er ref asto
}

}

public class genpraclab1 {
    public static void main(String[] args) {
        A<Integer> ai=new A<>(10); //Integer String egula builtin type but amra chaile user defined type o pathate pari as Integer ,String egula basically class ekekta so we can make our own class and pass it
        IO.println(ai.get());
        ai.m();
         A<String> as=new A<>("HELLO");
        IO.println(as.get());
        as.m();
        // A<T>[] arr=new A<>[10];//error
    A[] aa=new A[10] ;//alright pore value assigner somoy type assn kre dila
    A<?>[] aa1=new A[10];//??

    A<B> ab=new A<>(new B()); //new A<>(10) a 10 je ditam ta asole toh Integer er ekta obj so B pathate hole B er obj pathate hobe in new B() form
    IO.println(ab.get());
    ab.m();
    }
}
