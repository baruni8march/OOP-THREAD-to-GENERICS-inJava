enum A{
    B(4), C(2), D(1);

    int i;

    static{
        IO.println("static block");
    }

    A(int i){
        IO.println("constructor");
        this.i = i;
    }

    int m(){
        return i * 10;
    }
}
/*
output:
main start
constructor
constructor
constructor
static block
4
40
*/

public class lab15sp3{
    public static void main(String[] args){
        IO.println("main start");

        A a = A.B;

        IO.println(a.i);
        IO.println(a.m());
    }
}