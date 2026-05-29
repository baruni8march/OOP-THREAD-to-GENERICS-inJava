class Stats<T extends Number>{
    T[] t;
   Stats(T[] t){
    this.t=t;
   }
   double sum(){
    double sum=0;
     for(T x:t){
        sum+=x.doubleValue();
     }
     return sum;
   }
}
public class pplus3 {
    public static void main(String[] args) {
        Integer[] a = {2, 4, 6};
        Double[] b = {1.5, 2.5, 3.5};

        Stats<Integer> s1 = new Stats<>(a);
        Stats<Double> s2 = new Stats<>(b);

        System.out.println(s1.sum());
        System.out.println(s2.sum());
    }
}