class A implements Runnable {
   public void run() {
        IO.println("Runnable-run");
    }
}
public class MT2 {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);

        System.out.println("MainStart");
        t.start();
        System.out.println("MainEnd");
    }
}