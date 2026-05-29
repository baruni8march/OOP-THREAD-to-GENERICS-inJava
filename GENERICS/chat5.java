class Util{
    static <T> boolean isIn(T t,T[] v){
        boolean found=false;
        for(T x:v){
            if(t.equals(x)){
                found=true;
                break;
            }
        }
        return found;
    }
    static <T extends Comparable> int countGreater(T t,T[] arr){
        int c=0;
        for(T x:arr){
            if(x.compareTo(t)>0){
                c++;
            }
        }
        return c;
    }
}


public class chat5 {
    public static void main(String[] args) {
        Integer[] a = {2,4,6,8};
        String[] b = {"aa","bb","cc"};
        Character[] c = {'x','y','z'};

        System.out.println(Util.isIn(4, a));
        System.out.println(Util.isIn(5, a));
        System.out.println(Util.isIn("bb", b));
        System.out.println(Util.isIn('q', c));

        System.out.println(Util.countGreater(5, a));
        System.out.println(Util.countGreater("ab", b));
    }
}