//situation when finally doesnt execute:using System.exit(0)
class A{
    class B{

    }
}
class C extends A.B{
    C(A a){a.super();} //inner class extend korar arekta way
}
public class lab15{
    static void m(){
    // if(true){
    //     return;
    // }
        try{
           IO.println("try"); 
           System.exit(0);
           return;
        }
        finally{
            IO.println("finally"); 
        }
    }
    public static void main(String[] args) {
        m();
        A a=new A();
 C c=new C(a);//another way of extending inner class

    }

}