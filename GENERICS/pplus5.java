class Parent {
    int x;
    Parent(int x) {
        this.x = x;
    }
}

interface Add {
    int add();
}

class Child extends Parent implements Add {
    Child(int x) {
        super(x);
    }

    public int add() {
        return x + 5;
    }
}
class Test<T extends Parent & Add>{
    T t;
    Test(T t){
        this.t=t;
    }
   public int calc(){
       return (t.add()+10);
    }
}
public class pplus5 {
    public static void main(String[] args) {
        Test<Child> t = new Test<>(new Child(10));
        System.out.println(t.calc());
    }
}