class nongen{
  static <T extends Comparable<T>,V extends T> boolean meth(T t,V[] v){
   for(V x:v){
    if(t.equals(x)){
        return true;
    }
   }
   return false;
  }
}
public class slide2 {
    public static void main(String[] args) {
        Integer[] nums={2,3,4,1,10,5};
        IO.println(nongen.meth(4,nums));
    }

}
