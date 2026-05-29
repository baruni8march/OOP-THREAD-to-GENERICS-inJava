class Stats<T extends Number>{
    T[] t;
    Stats(T[] t){
        this.t=t;
    }
    double avg(){
        double sum=0;
        for(T x:t){
            sum+=x.doubleValue();
        }
        return sum/t.length;
    }
    boolean sameAvg(Stats<?> ob){
        return avg()==ob.avg();
    }
}
public class pplus8 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Double[] b = {1.0, 2.0, 3.0};
        Float[] c = {2.0f, 4.0f, 6.0f};

        Stats<Integer> s1 = new Stats<>(a);
        Stats<Double> s2 = new Stats<>(b);
        Stats<Float> s3 = new Stats<>(c);

        System.out.println(s1.sameAvg(s2));
        System.out.println(s1.sameAvg(s3));
    }
}