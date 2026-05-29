class Q{
    int n;
    boolean valueSet=false;
    synchronized int get(){
        while(!valueSet){try{wait();}catch(InterruptedException e){IO.println("oops");}}
        IO.println("Got: " + n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet){try{wait();}catch(InterruptedException e){IO.println("oopsii");}}
        this.n = n;
        IO.println("Put: " + n);
        valueSet=true;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
    }
    public void run(){
        for(int i=1;i<=3;i++) q.put(i);
    }
}
class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q=q;
        t=new Thread(this,"Consumer");
    }
    public void run(){
        for(int i=1;i<=3;i++) q.get();
    }
}
public class interthread1 {
    public static void main(String[] args) throws Exception {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
    }
}