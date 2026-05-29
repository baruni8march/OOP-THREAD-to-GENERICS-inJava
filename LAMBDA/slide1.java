interface myint<T>{ A<T> m(int n);}
class A<T>{
    T t;
    A(T t){
       this.t=t;
    }
    T getval(){
        return t;
    }
     
}