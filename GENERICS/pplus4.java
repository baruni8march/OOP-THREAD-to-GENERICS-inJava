class Box<T extends A>{
    T[] t;
  Box(T[] t){
    this.t=t;
  }
int total(){
    int sum=0;
    for(T p:t){
        sum+=p.x;
    }
    return sum;
}
}

class A {
    int x = 10;
}

class B extends A {
    B() {
        x = 20;
    }
}

class C extends B {
    C() {
        x = 30;
    }
}

public class pplus4 {
    public static void main(String[] args) {
        A[] a = {new A(), new A()};
        B[] b = {new B(), new B()};
        C[] c = {new C(), new C()};

        Box<A> b1 = new Box<>(a);
        Box<B> b2 = new Box<>(b);
        Box<C> b3 = new Box<>(c);

        System.out.println(b1.total());
        System.out.println(b2.total());
        System.out.println(b3.total());
    }
}