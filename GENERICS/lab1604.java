class A<T extends Number>{ //bounding with built-in class
    double m(T[] ar){
        double sum=0;
        for(T t:ar){
            sum+=t.doubleValue(); //NUmber thakay ei method use korte parchi
        }
        return sum;
    }
}
class C{int i=10;}
class D extends C{D(){i=20;}}
class E extends D{E(){i=30;}}
//bounding with user defined class
class B<T extends C>{
   int m(T[] ar){
    int sum=0;
    for(T t:ar){
        sum+=t.i;
    }
    return sum;

   }
}
public class lab1604 {
 
    public static void main(String[] args) {
        A<Integer> a1=new A<Integer>();
        Integer[] ar1={1,2,3,4,5};
        IO.println("sum of ar1:"+a1.m(ar1));

        A<Double> a2=new A<Double>();
        Double[] ar2={1.5,2.5,5.5};
        IO.println("sum of ar2:"+a2.m(ar2));

        //A<String> a3=new A<String>(); //wrong because T extends Number and string isnt subclass of number
        
       B<C> b1=new B<C>();
       C[] ar3={new C(),new C(),new C()};
       IO.println(b1.m(ar3));
       B<D> b2=new B<D>();
       D[] ar4={new D(),new D(),new D()};
       IO.println(b2.m(ar4));
       B<E> b3=new B<E>();
       E[] ar5={new E(),new E(),new E()};
       IO.println(b3.m(ar5));
 

    }


}
