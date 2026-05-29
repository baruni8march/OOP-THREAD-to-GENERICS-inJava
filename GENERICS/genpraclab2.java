class A<T extends Number>{
    double m(T[]  arr){
      double sum=0;
      for(T t:arr){
        sum+=t.doubleValue();
      }
      return sum;
    }
}
//ekhane builtin class diye bounding korsi bt user defined class diyeo kora jabe

class C{int i=10;}
class D extends C{
    D(){i=20;}
}
class E extends D{
    E(){i=30;}
}
class B<T extends C>{
    int m(T[] t){
        int sum=0;
        for(T t2:t){
            sum+=t2.i;
        }
        return sum;
    }
}

public class genpraclab2 {
  public static void main(String[] args) {
     A<Integer> ai=new A<>();
     Integer[] ar1={1,2,3,4,5};
     IO.println("sum="+ai.m(ar1));

     A<Double> ad=new A<>();
     Double[] ar2={1.5,2.5,3.5};
     IO.println("sum="+ad.m(ar2));

     B<C> bc=new B<C>();
     C[] ar3={new C(),new C(),new C()};
     IO.println(bc.m(ar3));
     B<D> bD=new B<D>();
     D[] ar4={new D(),new D(),new D()};
      IO.println(bD.m(ar4));
     B<E> bE=new B<E>();
     E[] ar5={new E(),new E(),new E()};
     IO.println(bE.m(ar5));
    }  
}
