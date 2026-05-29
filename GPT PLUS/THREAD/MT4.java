class A extends Thread{
    public void run(){
        IO.println(Thread.currentThread().getName() + " is running");
    }
}
public class MT4 {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        t1.setName("Alpha");
        t2.setName("Beta");

        t1.start();
        t2.start();
    }
}