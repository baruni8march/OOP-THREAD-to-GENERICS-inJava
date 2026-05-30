class Exc extends Exception{
    int i;
    Exc(int x){
        i=x;
    }
    public String toString(){
        return "bad["+i+"]";
    }
}
class A{
    int f(int x) throws Exc{
    IO.println("start "+x);
    if(x!=5){
    return x*2;}
    else{
        try{
            IO.println("mid "+5);
        throw new Exc(x);
        }
        finally{
            IO.println("A finally "+x);
        }
    }
}

}
public class GPT1 {
    public static void main(String[] args) {
        A a = new A();

        try {
            IO.println(a.f(2));
            IO.println(a.f(5));
            IO.println(a.f(8));
        }
        catch(Exc e) {
            IO.println("catch " + e);
        }
        finally {
            IO.println("main finally");
        }

        IO.println("end");
    }
}