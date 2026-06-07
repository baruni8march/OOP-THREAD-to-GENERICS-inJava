interface Creator<T> {
    T make();
}
class C<T>{
    C(Class<T> cls,T t){
        this.cls=cls;
        this.t=t;
    }
    T get(){
        return t;
    }
    Class type(){
        return cls.getName();
    }
    T[] array(int n){
        // Implementation for creating an array of type T
        T[] 
        return arr;
    }
}
public class TestC {

    static int testCounter = 1;

    static void tester(boolean b) {
        String status = "Failed";

        if(b)
            status = "Passed";

        System.out.printf("Test #%02d %s.%n", testCounter++, status);
    }

    static void take(Creator<? extends Number> c) {
        tester(c.make().intValue() == 4);
    }

    public static void main(String[] args) {

        C<String> cs = new C<>(String.class, "Hi");

        tester(cs.get().equals("Hi"));

        tester(cs.type().equals("java.lang.String"));

        String[] arr = cs.array(3);

        tester(arr.length == 3 && arr.getClass().getName().equals("[Ljava.lang.String;"));

        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";

        tester((arr[0] + arr[1] + arr[2]).equals("ABC"));

        C<Integer> ci = new C<>(Integer.class, 4);

        tester(ci.get() == 4 && ci.type().equals("java.lang.Integer"));

        Integer[] nums = ci.array(2);

        tester(nums.length == 2 && nums.getClass().getName().equals("[Ljava.lang.Integer;"));

        Creator<Integer> cr = ci;

        tester(cr.make() == 4);

        take(ci);

        C<String>.Box<String, Integer> box = cs.new Box<>("Age", 20);

        tester(box.show().equals("Age=20:Hi"));

        tester(cs.sameType(new C<String>(String.class, "Bye")) == true &&
               cs.sameType(ci) == false);
    }
}