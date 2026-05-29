class A{
    synchronized void foo(B b){
        String name=Thread.currentThread().getName();
        IO.println(name+"enter A.foo()");
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            IO.println("A interrupted");
        }
        IO.println(name+" trying to call B.last()");
        b.last();
    }
    synchronized void last(){
        IO.println("Inside A last");
    }
}
class B{
    synchronized void bar(A a){
        String name=Thread.currentThread().getName();
        IO.println(name+"enter B.bar()");
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            IO.println("B interrupted");
        }
        IO.println(name+" trying to call A.last()");
        a.last();
    }
    synchronized void last(){
        IO.println("Inside B last");
    }
}
public class deadlock implements Runnable{
  A a=new A();
  B b=new B();
  deadlock(){
    Thread t=new Thread(this,"my thread");
    t.start();
    a.foo(b);

  }
  public void run(){
    b.bar(a);
  }
}