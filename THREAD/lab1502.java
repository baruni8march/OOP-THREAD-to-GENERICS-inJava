//lab with my modification
class A implements Runnable{
    
        public void run(){
            IO.println("child starts");
        for(int i=0;i<10;i++){
            IO.println("A"+i);
    

        }
        IO.println("child ends");
    }
}
class B extends Thread{
    public void run(){
        IO.println("child 2");
    }
}

//third way:thread run korate chacchi but future a lagbena :just temporary thread-> anonymous thread



public class lab1502 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=Thread.currentThread();
        Thread t2=new Thread(new A(),"haha");
         Thread t3=new B();
// t2.start();
        IO.println(t);
       // try{
            Thread.sleep(1000);// sleep interrupted exception throw kore so try catch othoba throws dite hobe main methode 
        //}
        IO.println(t.threadId());
        IO.println(t.getName());
        t3.start();
        
         t2.start();
        // t3.start(); 
         t3.join();
          Thread at=new Thread(){
              public void run(){
                IO.println("child third anno");
                Thread ct=currentThread();
                IO.println(ct);
                IO.println(ct.threadId());
                IO.println(ct.getName());
                IO.println(ct.getPriority());
                IO.println("childthreadanno ended");
                
              }
          };
          at.start();
          at.join();
        
         
         
        //  Thread.sleep(1000);
        t.setName("haha");  
        IO.println(t.getName());
        t2.join(); //barbar sleep diye childke print koranor cheye better join dewa join dile child execution shesh howar ag porjonto ei line a main thread boshe thake
        // Thread.sleep(1000);
        IO.println(t.getPriority());
        IO.println(t);
        t.setPriority(1);
        IO.println(t.getPriority());
        IO.println(t);
    
    
    }
}
