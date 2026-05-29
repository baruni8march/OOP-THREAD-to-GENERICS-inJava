void main(){
Thread t=Thread.currentThread();
System.out.println(t.getPriority());
System.out.println(t.isAlive());
// System.out.println(t.isDaemon());
// System.out.println(t.isInterrupted());
// System.out.println(t.isInterrupted());
// System.out.println(t.isInterrupted());
IO.println("Thread Name:"+t);
IO.println("Thread Name:"+t.getName());

t.setName("sneha");
IO.println("Thread Name:"+t);
IO.println("Thread Name:"+t.getName());
try{
for(int i=1;i<=10;i++){
    IO.println(i);
    Thread.sleep(1000);
}}
catch(InterruptedException e){
    System.out.println("Thread Interrupted");

}

}