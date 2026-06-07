interface F{
    A m(int n);
}
class A{
    int x;
    A(int n){
        this.x=n*n;
    }
    public String toString(){
        return ""+x;
    } 
}
public class Q4{

    public static void main(String[] args){

        F f = A::new;

        IO.println(f.m(7));
    }
}