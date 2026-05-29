public class lab1304 {
    public static void main(String[] args) {
        IO.println("Main Start");
        // throw new ArithmeticException(); // error: unreachable statement as it is not under try-catch block
        // if (true) throw new ArithmeticException();
        try {
        if (true) 
            // throw new ArithmeticException("/ by zero");
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        } 
        catch (ArithmeticException e)
        { IO.println(e); }
        catch (ArrayIndexOutOfBoundsException e)
        { IO.println(e); 
            throw e; // Re-throw
        }
        IO.println("Main End"); 
    }
}