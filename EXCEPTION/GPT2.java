class Exc extends Exception{
     int x;
     Exc(int a){

        x=a;
     }
    public String toString(){
        return "E"+x;
    }
}
class NewExc extends Exception{
     int x;
     NewExc(int a){

        x=a;
     }
    public String getMessage(){
        return "N"+x;
    }
}
class A{
    void test(int x) throws Exc,NewExc {
        IO.println("inside "+x);
        if(x==1){
            try{
                int d=0;
                IO.println(1/d);    
              }
              catch(ArithmeticException e){
                IO.println("inner catch");
                
                throw new Exc(x);
              
            
            }
        }
        else if(x==2){
            throw new NewExc(x);
        }
        else if(x==3){
            IO.println("outer finally 3");
            throw new ArithmeticException();
        }
    }
}
public class GPT2 {
    public static void main(String[] args) {
        A a = new A();

        for(int i = 0; i < 4; i++) {
            try {
                IO.println("call " + i);
                a.test(i);
                IO.println("done " + i);
            }
            catch(NewExc e) {
                IO.println("new " + e.getMessage());
            }
            catch(Exc e) {
                IO.println("old " + e);
            }
            catch(RuntimeException e) {
                IO.println("run " + e.getClass().getSimpleName());
            }
            finally {
                IO.println("finally " + i);
            }
        }

        IO.println("finish");
    }
}