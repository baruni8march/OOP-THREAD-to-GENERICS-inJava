class A<T>{
    T t;
    //static T s wrong because T ekta type parameter ja object creationer somoy toiri hoy so eta non static
    //static T m(){return t;} wrong
    T[] ta;//alright
    void m3(){
        T[] ta;
        // ta=new T[10];  //eta wrong cz u cannot create array in generic rather u can assign
    }
    A(T t){
        this.t=t;
    }
    T m1(){
        return t;
    }
    void m2(){
        IO.println(t.getClass().getName());
    }

}
//try multi type parameter homework
class B{}
public class lab1603 {
   public static void main(String[] args) {
     A<Integer> ai=new A<Integer>(10);
    IO.println(ai.m1());
    ai.m2();

    // A<String> as=new A<String>("sneha");
    // IO.println(as.m1());
    // as.m2();
    A<String> as=new A<>("sneha"); //just using the diamond operator both are correct
    IO.println(as.m1());
    as.m2();

    // A<Integer>[] aa=new A<Integer> [10];//wrong
     
    A[] aa=new A[10];//correct
    A<?>[] aa1=new A[10];//correct
     
   A<B> ab=new A<B>(new B());
   IO.println(ab.m1());ab.m2();
   

   }
}
