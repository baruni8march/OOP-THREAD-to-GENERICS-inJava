class A implements Runnable {
   public int c = 1;
     public synchronized void run(){
      IO.println(Thread.currentThread().getName() + ":"+c);
      c++;
        
    }
}
public class MT7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A(), "T1");
        Thread t2 = new Thread(new A(), "T2");

        t1.start();
        t2.start();
    }
}