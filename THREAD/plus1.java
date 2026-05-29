class Producer extends Thread {
    Box b;
    Producer(Box b){ this.b = b; }

    public void run() {
        for(int i = 1; i <= 3; i++) b.put(i);
    }
}

class Consumer extends Thread {
    Box b;
    Consumer(Box b){ this.b = b; }

    public void run() {
        for(int i = 1; i <= 3; i++) b.get();
    }
}

class Box {
    int n;
    boolean state = false; // false means box is empty

    synchronized void put(int i) {
        while(state) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        n = i;
        IO.println("Put: " + n);
        state = true;
        notify();
    }

    synchronized void get() {
        while(!state) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        IO.println("Got: " + n);
        state = false;
        notify();
    }
}

public class plus1 {
    public static void main(String[] args) throws Exception {
        Box b = new Box();
        Thread p = new Producer(b);
        Thread c = new Consumer(b);

        c.start();
        p.start();

        p.join();
        c.join();

        System.out.println("Done");
    }
}