import java.util.*;
class C {
    private int i; 
    C(int i) { this.i = i; }
    int getI() { return i; }
}
class D{static int m(C c1, C c2) {
    return c2.getI() - c1.getI();
}}
public class lab1704 {
    public static void main(String[] args) {
        ArrayList<C> list = new ArrayList<>();
        list.add(new C(5));
        list.add(new C(3));
        list.add(new C(8));
        C cmin = Collections.min(list, D::m); 
        IO.println(cmin.getI()); // 3
        C cmax = Collections.max(list, D::m);
        IO.println(cmax.getI()); // 8
    }
}