/* 
enum A{
    B{
        void m(){
            IO.println("B");
        }
    },
    C{
        void m(){
            IO.println("C");
        }
    };

    abstract void m();
}
    here B,C work like anonymous class

*/



enum A{
    B,
    C{
        void m(){
            IO.println("C special");
        }
    },
    D;

    void m(){
        IO.println("normal A method");
    }
}

public class Test{
    public static void main(String[] args){
        A.B.m();
        A.C.m();
        A.D.m();
    }
}