//EXPRESSION LAMBDA
interface F{int m();}
interface F2{double m();}
interface G{boolean m(int n);}
interface H{int m(int a,int b);}
public class lab17 {
    public static void main(String[] args) {
       F f=()->20;
       F q=()->(short)10;
      // F s=()->"haha"; type mismatch
       IO.println(f.m());
       IO.println(q.m());
       F2 f2=()->Math.random()*100;
       IO.println(f2.m());
       G g=n->n%2==0;
       IO.println(g.m(4)); 
        G g3=(n)->n%3==0;
       IO.println(g3.m(9)); 
       H add=(a,b)->a+b;
       //H add=(int a,int b)->a+b; alright
       //H add=(int a, b)->a+b; wrong
       H sub=(a,b)->a-b;
       IO.println(add.m(2,3));
       IO.println(sub.m(10,8));
       //BLOCK LAMBDA
       H bl=(a,b)->{
           int sum=0;
           for(int i=a;i<=b;i++){
            sum+=i;
           }
           return sum;
       };
       IO.println("BLOCK LAMBDA OUTPUT:"+bl.m(3,5));
    }
}