package ex1;
// import ex1.p1;
// import ex1.p3.PC.I1;
// import ex1.p3.PC.I2;
// import ex1.p1.p2.PB;
class S implements ex1.p3.PC.I2{
   public int m5(int i){
        return i*i/2+1;
    }
}
public class PI1 {
    public static void main(String[] args) {
        System.out.println("Start");
        ex1.p1.PA pa = new ex1.p1.PA(4);
        System.out.println(pa.m1("ABC"));
        System.out.println(pa.m2(5));
        ex1.p3.PC.I1 i1 = pa;
        System.out.println(i1.m2(7));
        System.out.println(ex1.p1.p2.PB.m3("java"));
        ex1.p1.p2.PB pb = new ex1.p1.p2.PB(3);
        System.out.println(pb.m4(2, 5));
        ex1.p3.PC pc = pb;
        System.out.println(pc.m4(4, 6));
        System.out.println(ex1.p3.PC.util("XY"));
        S s = new S();
        System.out.println(s.m5(5));
        ex1.p3.PC.I2 i2 = s;
        System.out.println(i2.m5(9));
    }
}
