 class NewExc extends Exception{
        int n;
        NewExc(int n) {    
              this.n=n;        
        }
        public String toString() {
            return "NewExc["+n+"]";
        }
       NewExc init() {
        this.n=15;
        initCause(new ArithmeticException("/ by zero"));
        return this;
       }


    }
class Exc{
   static void e(){
    throw new NullPointerException("E");

    }
   static void c(int x) throws NewExc{
    throw new NewExc(x).init();
   }
}
   

public class EH1 {
    public static void main(String[] args) {
        for (int n = 6; n >= 0; n--) {
            System.out.println("Case:" + n);
            try {
                System.out.println("Start:" + n);
                if (n == 0) Exc.a();
                else if (n == 1) Exc.b();
                else if (n == 2) Exc.c();
                else if (n == 3) Exc.d(n);
                else if (n == 4) throw new NewExc(n);
                else if (n == 5) throw new NewExc(n).init();
                else Exc.e();
                System.out.println("End:" + n);
            } catch (ArithmeticException | NullPointerException ex) {
                System.out.println("R1:" + ex);
                if (ex.getCause() != null) System.out.println("Cause:" + ex.getCause());
            } catch (NewExc ex) {
                System.out.println("R2:" + ex);
                if (ex.getCause() != null) System.out.println("Cause:" + ex.getCause());
            } catch (Exception ex) {
                System.out.println("R3:" + ex);
                if (ex.getCause() != null) System.out.println("Cause:" + ex.getCause());
            } finally {
                System.out.println("F:" + n);
            }
        }
        System.out.println("Done");
    }
}