class A extends Thread {
    public void run(){
        System.out.println("A-run");

    }
}
public class MT1 {
    public static void main(String[] args) {
        A t = new A();
        System.out.println("MainStart");
        t.start();
        System.out.println("MainEnd");
    }
}