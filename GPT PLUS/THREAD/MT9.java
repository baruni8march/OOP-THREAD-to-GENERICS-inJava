class A extends Thread {
    public void run(){IO.println("A");}
}
public class MT9{
    public static void main(String[] args) throws Exception {
        A t = new A();
        t.start();
        t.join(); //plays an imp role
        System.out.println("MainAfterJoin");
    }
}