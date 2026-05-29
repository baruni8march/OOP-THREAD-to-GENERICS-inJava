
// class Z{}
class A extends Exception{ //we can do anythg we do in normal class:keeping instance variables etc.
     int i;
     A(int i){
     super("Detail A"+i);//default output:Exception in thread "main" A: Detail A3
    this.i=i;}
// A(){
//     super("/by zero");
// }
//  }
public String toString(){
     return "Detail A "+i+"(" +super.toString()+")";//output:Detail A 3(A: Detail A3)
 
}
}
//exception ekta checked exception so eke extend koratao checked but arithmetic unchecked
class B extends ArithmeticException{}
public class lab1402 {
    
    public static void main(String[] args) {
    //   throw new Z(); ekhane random jekono classkei throw kora jabena.shudhu throwable class/ tar kono subclasske extend korle kora jabe.
      //throw new A();//only this line will create a problem because the eception needs to be reported/handled : by try catch block or using throws keyword in main method
  // throw new B();//no problem as arithmetic exception is unchecked exception so it doesn't need to be handled by try catch block or throws keyword in main method
    try{
     throw new A(3);
    }
      catch(A e){
         IO.print(e);//output:(class name:details)-> A: Detail A3(without tostring)
        //if you just want to print the details but not the class then need to override the toString() method
        //and if you want to print the message it used to be before then have to super.toString() inside the toString() method
     }
    }
}
