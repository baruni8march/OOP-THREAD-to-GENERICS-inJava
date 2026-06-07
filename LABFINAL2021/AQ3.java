class NewExc extends Exception{
    NewExc(int x){
        super("New Exception: "+x);
     }
    
}
class Exc{
    static void a(){
        throw new ArithmeticException();
    }
    static void b(){
        NullPointerException n=new NullPointerException();
        ArithmeticException a=new ArithmeticException();
        n.initCause(a);
        throw n;
    }
    static void c(){
        throw new ArrayIndexOutOfBoundsException("Index Out!");
    }
    static void d() throws NewExc{
        throw new NewExc(0);
    }


}
public class AQ3 {
    public static void main(String[] args) {
        for (int n=0; n<6; n++) {
            System.out.println("Exceptions Case: " + n);
            try {
                if (n == 0) {
                    System.out.println("Starting: " + n);
                    Exc.a();
                    System.out.println("Ending: " + n);
                }

                if (n == 1) {
                    System.out.println("Starting: " + n);
                    Exc.b();
                    System.out.println("Ending: " + n);
                }

                try {
                    if (n == 2) {
                        System.out.println("Starting: " + n);
                        Exc.c();
                        System.out.println("Ending: " + n);
                    }
                    else if (n == 3) {
                        System.out.println("Starting: " + n);
                        Exc.d();
                        System.out.println("Ending: " + n);
                    }
                    else {
                        System.out.println("Starting: " + n);
                        throw new NewExc(n);
                    }
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Exception is " + ex);
                    if(ex.getCause()!=null) System.out.println("Cause: " + ex.getCause());
                }
            } catch (ArithmeticException | NullPointerException ex) {
                System.out.println("Exception = " + ex);
                if(ex.getCause()!=null) System.out.println("Cause: " + ex.getCause());
            } catch (NewExc ex) {
                System.out.println(ex);
                if(ex.getCause()!=null) System.out.println("Cause: " + ex.getCause());
            } catch (Exception ex) {
                System.out.println("Any Exception");
                if(ex.getCause()!=null) System.out.println("Cause: " + ex.getCause());
            }
        }

        System.out.println("Exam Ended");
    }
}