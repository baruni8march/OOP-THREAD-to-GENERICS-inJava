interface minmax<T>{
    T min();
    T max();
}
class hi<T extends Comparable<T>> implements minmax<T>{
    T[] arr;
     hi(T[] t){
        arr=t;
     }
     public T min(){
        T mini=arr[0];
        for(T x:arr){
            if(x.compareTo(mini)<0) mini=x;
        }
        return mini;
     }
     public T max(){
        T max=arr[0];
        for
     }
}

public class slide4hard {
    
}

