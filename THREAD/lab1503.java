

//DEADLOCK BASAY DEKHBA
class Counter{
    int count=0;
    //two ways to make synchronized: direct je methode synchronized dorkar sekhane dewa:
    //public synchronized void increment () {..}
    //or by using synchronized block in line 20
    public void increment () {
        count++;
    }
}

class counterthread extends Thread{
    Counter counter;
    public counterthread(Counter counter){
            this.counter=counter;
        }
    public void run(){
        for(int i=0;i<1000;i++){
            synchronized(counter){
                //second way to make synchronized:creating block
                counter.increment();
            }
        }
    }
//factory method:nijer classer object return kore jate direct call dite pari
//like normally we create thread->then use t.start()->t.join() but factory method reduces it
//method of it always be static
       static counterthread createAndRuncounterthread(Counter c){
        counterthread ct=new counterthread(c);
         ct.start();
         return ct;
    }
}

public class lab1503 {
    
    public static void main(String[] args) throws InterruptedException {
         Counter demo=new Counter();
        // Thread t1=new counterthread(demo);
        // Thread t2=new counterthread(demo);
        // t1.start();
        // t2.start();

        //using factory method
        counterthread t1=counterthread.createAndRuncounterthread(demo);
        counterthread t2=counterthread.createAndRuncounterthread(demo);

        t1.join();
        t2.join();
        System.out.println("Final count "+demo.count);


    }
}
