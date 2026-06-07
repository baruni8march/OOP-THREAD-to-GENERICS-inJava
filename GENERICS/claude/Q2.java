interface Drawable { void draw(); }
interface Comparable<T> { int compare(T other); }

class Shape implements Drawable, Comparable<Shape> {
    int size;
    Shape(int size) { this.size = size; }
    public void draw() { IO.println("Drawing: " + size); }
    public int compare(Shape other) { return size - other.size; }
}

public class B<T extends Shape & Drawable> {
    T obj;
    B(T obj) { this.obj = obj; }
    void show() {
        obj.draw();
        IO.println("Size: " + obj.size);
    }
}

class A<T extends Shape & Drawable >{
    T ob;
    A(T o){
        ob=o;
    }
    void display(){
        ob.draw();
        IO.println("Size: "+ob.size);
    }
    void compare(T b){
        if(ob.compare(b)>0){
            IO.println(b.size+" is smaller");
        }
        else{
             IO.println(ob.size+" is smaller");
        }
    }
}



public class Q2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln());
        int m = Integer.parseInt(IO.readln());
        A<Shape> a = new A<>(new Shape(n));
        a.display();
        a.compare(new Shape(m));
        B<Shape> b = new B<>(new Shape(n));
        b.show();
    }
}