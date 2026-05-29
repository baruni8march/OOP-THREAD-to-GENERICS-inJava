interface B {
    int p = 4;
    int f(int x);

    default String g(String s) {
        return s + ":" + p;
    }

    interface C {
        int q = 7;
        int h(int y);
    }
}
class A implements B,B.C{
    int i;
    A(int i){
this.i=i;
    }
   public int f(int x){
      return x+p+i;
    }
    public int h(int y){
       return i+q+y;
    }
}
public class QI1 {
    public static void main(String[] args) {
        A a = new A(5);
        B b = a;
        B.C c = a;

        System.out.println(a.i + B.p + B.C.q);
        System.out.println(b.f(3));
        System.out.println(c.h(2));
        System.out.println(b.g("HI"));

        a.i += 4;

        System.out.println(b.f(3));
        System.out.println(c.h(2));
    }
}