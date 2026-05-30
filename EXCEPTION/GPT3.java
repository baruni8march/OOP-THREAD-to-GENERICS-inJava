class Exc extends Exception{
    String s;
    Exc(String s){
        super(s);
        this.s=s;
    }
public String getMessage(){
    return s;
}
}
class A{
    void work(int x,int b) throws Exc{
        
            if(b==0){
                Exc e=new Exc("divide failed");
                ArithmeticException a=new ArithmeticException("/by zero");
                e.initCause(a);
                throw e;
            }

        

    }
}
public class GPT3 {
    public static void main(String[] args) {
        A a = new A();

        try {
            a.work(10, 0);
        }
        catch(Exc e) {
            IO.println("caught " + e.getMessage());
            IO.println("cause " + e.getCause());
            IO.println("text " + e);
        }

        try {
            a.work(8, 2);
            IO.println("safe");
        }
        catch(Exc e) {
            IO.println("again");
        }
    }
}