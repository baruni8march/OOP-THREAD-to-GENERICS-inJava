public class lab14{
    static void m(){
      // if(true){
      //   int k=1/0;
      // }

      try{
        int i=1/0;
        IO.println("Never print");
      }
      catch(ArithmeticException e){
         IO.println(e); //int j=1/0;
       // return;
      } //ekhane catch block na thakle tao age finally execute hobe then default exception print hobe
      finally{
        IO.println("finally"); //always execute hobe jokhoni try blocker bhetor dhukbe but uporer condition e exception thakle try block er code execute hobe na so finally block execute hobe na
      }
      IO.println("m ends"); //return dile eta print hobena but main end thiki print hobe    
    }
    public static void main(String[] args){
        IO.println("main starts");
        m();
        IO.println("main ends");

    }
}