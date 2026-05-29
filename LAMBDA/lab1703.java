interface F{
    int m(int n);
}
interface G{
    int m()
}
class A{
   static int meth(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
        fact*=i;
      }
      return fact;
    }
}
public class lab1703 {
   
public static void main(String[] args) {
   F f=A::meth;
   IO.println(f.m(5));
}    
}
