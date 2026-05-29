class Stats<T extends Number>{
    T[] arr;
  Stats(T[] arr){
    this.arr=arr;
  }
  double avg(){
    double sum=0;
    for(T t:arr){
        sum+=t.doubleValue();
    }
    return sum/arr.length;
  }
  boolean sameAvg(Stats<?> b){
    double a1=this.avg();
    double a2=b.avg();
    return a1==a2;
  }
}


public class chat3 {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        Double[] b = {1.0,2.0,3.0,4.0,5.0};
        Short[] c = {2,2,2,2,2};

        Stats<Integer> s1 = new Stats<Integer>(a);
        Stats<Double> s2 = new Stats<Double>(b);
        Stats<Short> s3 = new Stats<Short>(c);

        System.out.println(s1.avg());
        System.out.println(s2.avg());
        System.out.println(s3.avg());

        System.out.println(s1.sameAvg(s2));
        System.out.println(s1.sameAvg(s3));
    }
}