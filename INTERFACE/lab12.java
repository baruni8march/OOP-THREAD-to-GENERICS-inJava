interface A {    
    // {} //  error: initializers not allowed in interfaces
    // static {} //  error: initializers not allowed in interfaces
    // int i; //  error: = expected
    int i = 10; 
    public static final int j = 20;
    void m();
    // void m2() {} // error: interface abstract methods cannot have body
    abstract void m2();
    default void m9(){
        IO.println("interface m9");
    }
    // public void m3();
    // final void m5(); //error: modifier final not allowed here
    // final void m5() {} // error: modifier final not allowed here
}

// class H implements A {} // error: H is not abstract and does not override abstract method m3() in A
abstract class H implements A {}
class K implements A {
    public void m() {}
    public void m2() {}
   public void m9(){ //method overriding 
    A.super.m9();// in this way only you can access the super class method incase if you override it just like here
        IO.println("K m9");

    }
    void m4() {}
}

class lab12{
    public static void main(String[] args) {
        A a;
        // A a2 = new A(); // error: A is abstract; cannot be instantiated
        a = new K();
        a.m(); a.m2();a.m9();
    // a.m4(); // error: cannot find symbol because object is of type A and we can only call methods both A and K have
        IO.println(A.i+" "+A.j);
        K k = new K(); 
        k.m4();
        IO.println(k.i+" "+k.j); //it somehow inherits the value of i and j from A 
    }
}