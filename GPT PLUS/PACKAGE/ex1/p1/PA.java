package ex1.p1;
// import ex1.p3.PC.I1;

public class PA extends ex1.p3.PC.I1 {
    public static int i;
    public PA(int j){
       i=j;
    }
   public String m1(String s){
        return s+"::"+i;
    }
    public int m2(int j){
        return j+i+i;
    }
}
