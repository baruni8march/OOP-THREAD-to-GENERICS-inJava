package p1;
import p1.aaa.a;
import p2.c;
public class b extends a {
   public b(int x) {
        super(x);
    }
    public static void main(String[] args){
        a obj=new a(10);
        System.out.println(obj.x);
        IO.println(c.y);
    }
}
