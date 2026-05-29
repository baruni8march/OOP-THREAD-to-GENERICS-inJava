class Holder<T>{
    T t;
    Holder(T t){
      this.t=t;
    }
    T get(){
        return t;
    }
    void showType(){
        IO.println(t.getClass().getName());
    }
}

public class pplus1 {
    public static void main(String[] args) {
        Holder<Integer> h1 = new Holder<>(50);
        Holder<String> h2 = new Holder<>("Java");

        System.out.println(h1.get());
        h1.showType();

        System.out.println(h2.get());
        h2.showType();
    }
}