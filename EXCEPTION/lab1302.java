class A {
 //public String toString() {return "ABC";}
}
public class lab1302 {
    static void m() {throw new ArithmeticException("sneha");}
    public static void main(String[] args) {
        IO.println("Main Start");
        A a = new A(); IO.println(a.getClass()); //output:class A
        try {
            if (args.length==0) m();
            int c[] = {1}; c[10] = 10;
        }
        // catch(Exception e){ // error: exception ArithmeticException has already been caught
        //     IO.println(e);
        // }
        catch(ArithmeticException e){
            IO.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            IO.println(e);
        }
        catch(Exception e){
            IO.println(e);
        }

       IO.println("Main End");
    }
}