// t1.run();
// no new thread
// runs like ordinary method
// current thread is main
// t2.start();
// new thread created
// JVM later calls run() in that new thread
class A extends Thread {
    String s;

    A(String s) {
        this.s = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }
}
public class MT3 {
    public static void main(String[] args) {
        A t1 = new A("X");
        A t2 = new A("Y");

        t1.run();
        t2.start();
        System.out.println("Main");
    }
}