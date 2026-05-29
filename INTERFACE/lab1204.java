interface A {
    // default void m(); // error: missing method body, or declare abstract
    default void m() {}
}
interface B { default void m() {} }
// class W implements A {} its alright because no conflict .it automatically inherits m() from A and we dont need to override it
// class W implements A, B {} // error: types A and B are incompatible because:If a class implements two interfaces with the same default method signature, a conflict occurs.Java does not know which default to use, so the class must override the method:
class W implements A, B {
    public void m() {} //its alright now because we have overridden the method,so no conflict
}

public class lab1204{
    public static void main(String[] args) {
        
    }
}