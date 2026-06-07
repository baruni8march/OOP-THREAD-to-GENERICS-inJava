class Record {
    int id;
    String data;
    Record(int id, String data) { this.id = id; this.data = data; }
}

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}
class A<T>{
    T ob;
    A(T o){
        ob=o;
    }
    void show(){
         
    }
}
public class HardestQ1 {
    public static void main(String[] args) {
        int id = Integer.parseInt(IO.readln());
        String data = IO.readln();
        String name = IO.readln();
        int age = Integer.parseInt(IO.readln());
        
        Record r = new Record(id, data);
        Person p = new Person(name, age);
        
        A<Record> ar = new A<>(r);
        A<Person> ap = new A<>(p);
        
        ar.show();
        ap.show();
        
        IO.println(A.getCount());
        IO.println(A.getTypes());
    }
}