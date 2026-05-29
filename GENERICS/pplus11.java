class Converter{
    double d;
    <T extends Number> Converter(T t){
        d=t.doubleValue();
    }
    void show(){
        IO.println(d);
    }
}
public class pplus11 {
    public static void main(String[] args) {
        Converter c1 = new Converter(10);
        Converter c2 = new Converter(5.5f);
        Converter c3 = new Converter(7.25);

        c1.show();
        c2.show();
        c3.show();
    }
}