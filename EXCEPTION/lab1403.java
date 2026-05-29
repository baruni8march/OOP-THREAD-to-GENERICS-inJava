//chained exception
public class lab1403 {
public static void main(String[] args) throws Exception{
   try{ NullPointerException n=new NullPointerException();
    ArithmeticException a=new ArithmeticException();
    a.initCause(n);//now output:caused by NullPointerException 
    try{
      throw a;
    }
    catch(ArithmeticException e){
       IO.println(e);
       IO.println(e.getCause());
       IO.println("hi");
    }
   // a.initCause(n);//cannot override the cause
   //Exception e=new Exception("msg",a); outputs:java.lang.Exception:msg
    Exception e=new Exception(a);//making a the cause of exception e outputs:java.lang.Exception: java.lang.ArithmeticException
    throw e;//output: caused by ArithmeticException 
    //we can make chained exception by taking in constructor /using initcause method    
   //   NewExc(String msg, Throwable cause) {
   //      super(msg, cause);
   //  }
   //only if its constructor is designed with two parameters
//so its a chained exception output: Exception->arithmetic->null stack trace like this
}
 catch(Exception e){
//  IO.println(e); //only prints exception but not the causal ones
// IO.println(e.getCause()); //prints the causal exception of exception:arithmetic
// IO.println(e.getCause().getCause()); //prints the causal exception of arithmetic: null
 
//if there are too many causes it wont be possible to print manually so loop needed
 IO.println(e);
 var c=e.getCause();
 while(c!=null){
    IO.println(c);
    c=c.getCause();
 }


   }
}
    
}
