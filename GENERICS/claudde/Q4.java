interface Comparable<T> {
    int compareTo(T other);
}

class Data implements Comparable<Data> {
    int value;
    Data(int value) { this.value = value; }
    public int compareTo(Data other) { return this.value - other.value; }
}
class A<T extends Data >{
    T a,b;
    A(T a,T b){
        this.a=a;
        this.b=b;
    }
    int compare(){
        return a.compareTo(b);
    }
    int getMax(){
        if(a.value>=b.value){
            return a.value;
        }
        else{
            return b.value;
        }
    }

}
public class Q4 {
    public static void main(String[] args) {
        int x = Integer.parseInt(IO.readln());
        int y = Integer.parseInt(IO.readln());
        
        Data d1 = new Data(x);
        Data d2 = new Data(y);
        
        A<Data> a = new A<>(d1, d2);
        IO.println(a.compare());
        IO.println(a.getMax());
    }
}