// enum A{B,C,D}
//enume classer moto instance variable,method,constructor dewa jay
//try out with static block etc
//try out other topic lab code as well
enum A{B(4),C(2),D(1);
    int i;
    A(int i){
        IO.println("enumA");
      this.i=i;
    }

    int m(int j){
        return i*j;
    }
}
public class lab1504{
 public static void main(String[] args){
    A a=A.B;
    //wrong:a=new A(3);
    //a=10; enumer value change kora jayna
    IO.println(a);
    for(A a2:A.values()){
        IO.println(a2+":"+a2.ordinal()+":"+a2.i+":"+a2.m(5));
    }
 }
}