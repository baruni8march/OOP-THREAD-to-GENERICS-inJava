// Q3.java
// Complete only the TODO parts.
// Topic: generic method reference and predefined Function<T, R>.

import java.util.function.Function;

// TODO-1: Write a generic functional interface named Matcher<T>.
// Its single method must receive T[] and T, then return int.
interface Matcher<T>{
    int count(T[] arr,T x);
}
class ArrayTool {
    // TODO-2: Write a generic static method countEqual.
    // It must count how many array elements are equal to the target.
    // Use equals safely so null values do not crash the program.
    static <T> int countEqual(T[] arr,T x){
        int c=0;     
        for(T i:arr){
                if(x.equals(i)){
                    c++;
                }
             }
             return c;
    }
}

public class Q3 {
    static <T> int run(Matcher<T> matcher, T[] values, T target) {
        return matcher.count(values, target);
    }

    public static void main(String[] args) {
        Integer[] nums = {4, 1, 4, 2, 4, 3};
        String[] words = {"Two", "One", "Two", "two", "Two"};

        Matcher<Integer> countInt = ArrayTool::<Integer>countEqual;
        Matcher<String> countStr = ArrayTool::<String>countEqual;

        // TODO-3: Complete this expression lambda.
        // It must convert the input string to lowercase and wrap it inside { }.
        Function<String, String> tag =(a)->"{"+a.toLowerCase()+"}";
        System.out.println("4 appears " + run(countInt, nums, 4) + " times");
        System.out.println("Two appears " + run(countStr, words, "Two") + " times");
        System.out.println(tag.apply("GENERIC"));
    }
}
