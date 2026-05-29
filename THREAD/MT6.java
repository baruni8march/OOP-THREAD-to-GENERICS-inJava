class A implements Runnable {
   public int c = 1;
     public synchronized void run(){
      IO.println(Thread.currentThread().getName() + ":"+c);
      c++;
        
    }
}
public class MT6 {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a, "T1");
        Thread t2 = new Thread(a, "T2");

        t1.start();
        t2.start();
    }
}