class A extends Thread {
    public void run(){
        IO.println("ChildStart");
        try{
            Thread.sleep(1000);
            IO.println("ChildEnd");
        }
        catch(InterruptedException e){
            IO.println("Got interrupted");
        }
    }
}
public class MT5 {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        System.out.println("MainDone");
    }
}