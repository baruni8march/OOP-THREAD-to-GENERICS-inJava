// Q1.java
// Complete only the TODO parts.
// Topic: static method reference, object instance method reference, lambda expression.

// TODO-1: Write a functional interface named TextTask.
// It must have exactly one abstract method that receives one String and returns one String.
interface TextTask{
    String apply(String s);
}
class TextOps {
    // TODO-2: Write static method reverseClean(String s).
    // It must keep only letters, convert them to lowercase, and return them in reverse order.
    static String reverseClean(String s){
        String res=s.toLowerCase();
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            ans+=s.charAt(i);
        }
        return ans;
    }

    // TODO-3: Write instance method bracket(String s).
    // It must return the uppercase version of s inside square brackets.
    String bracket(String s){
        String ans="[";
        for(int i=0;i<s.length();i++){
            ans+=s.charAt(i);
        }
        ans+="]";
        return ans.toUpperCase();
    }
}

public class Q1 {
    static String use(TextTask task, String value) {
        return task.apply(value);
    }

    public static void main(String[] args) {
        String input = "Ja-va 8: Lambda!";

        TextTask cleanReverse = TextOps::reverseClean;

        TextOps ops = new TextOps();
        TextTask decorate = ops::bracket;

        // TODO-4: Complete this lambda expression.
        // It must remove all vowels from the given String.
        TextTask removeVowels = (s)->{
            String ans="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    continue;
                }
                ans+=s.charAt(i);
            }
            return ans;
            
        };

        System.out.println(use(cleanReverse, input));
        System.out.println(use(decorate, "method ref"));
        System.out.println(use(removeVowels, "Constructor Reference"));
    }
}
