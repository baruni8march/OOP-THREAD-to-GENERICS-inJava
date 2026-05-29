public class lab1303 {
    static void m() {
        try { //int i = 1/0;
            try {
                int j = 1/0; } 
            // catch(ArithmeticException e) 
            // {IO.println("NestedTry");}
            catch(ArrayIndexOutOfBoundsException e) 
            {IO.println("NestedTry");}
        } catch (ArrayIndexOutOfBoundsException e) 
            {IO.println("OuterTry");}
            catch(ArithmeticException e) 
            {IO.println("OuterTry"); int k = 1/0;}
    }
    public static void main(String[] args)  {
        IO.println("MainStart");        
        try {
            m();
        } 
        catch(ArithmeticException e){
            IO.println("MainCatch()"); 
           // int i = 1/0;
        }
        IO.println("MainEnd");
    }

}