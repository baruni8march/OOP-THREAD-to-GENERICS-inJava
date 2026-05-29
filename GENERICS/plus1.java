class Stats<T extends Number>{
    T[] nums;
    Stats(T[] nums){ this.nums = nums; }

    double avg(){
        double s = 0;
        for(T x : nums) s += x.doubleValue();
        return s / nums.length;
    }

    boolean same(Stats<T> ob){
        return avg() == ob.avg();
    }
}

public class Q1{
    public static void main(String[] args){
        Integer[] a = {1, 2, 3};
        Double[] b = {1.0, 2.0, 3.0};

        Stats<Integer> s1 = new Stats<>(a);
        Stats<Double> s2 = new Stats<>(b);

        System.out.println(s1.same(s2));
    }
}