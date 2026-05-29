// import java.lang.reflect.*;
// //this package is used to get information about classes
// //also used to check if a class/method has any annotation or not
// class A{}
//  class B extends A{int i;static int j;
//    private void m(int k){} //method 1
//     public static void m(){} //method 2
// }
// public class lab16 {
//     public static void main(String[] args) {
//         Class<?> b=B.class;
//         IO.println(b.getName());
//         IO.println(Modifier.toString(b.getModifiers()));
//         IO.println("is interface:"+b.isInterface());
//         IO.println("is annotation:"+b.isAnnotation());
//         IO.println("is enum:"+b.isEnum());
//          IO.println("Super class name:"+b.getSuperclass());
//         IO.println("Super class name:"+b.getSuperclass().getName());
//         IO.println("Methods:");
//         for(Method m:b.getDeclaredMethods()){ //getMethods() is used to get public methods
//          IO.println(m.getName()+" "+Modifier.toString(m.getModifiers()));
//         }

//         IO.println("Fields:"); //field means variable
//         for(Field f:b.getDeclaredFields()){ //getFields() is used to get public fields
//          IO.println(f.getName()+" "+Modifier.toString(f.getModifiers()));
//         }

//     }
// }

import java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME) 
@interface A{int m(); String s() default "sneha"}

@Retention(RetentionPolicy.RUNTIME) 
@interface B{int value();}

@@Retention(RetentionPolicy.RUNTIME) 
@Repeatable(H.class)
@interface G{int value();}

@Retention(RetentionPolicy.RUNTIME) 
@interface H{ G[] m();}

@A(m=44,s="hi")
@G(2) @G(4)
class demo{
    @B(100) @G(4)  
    int meth(){
        return 4;
    }
}
 public class lab16{
   public static void main(String[] args) {
    demo d=new d();
    Class<?> a=d.getClass();
    Method m=a.getMethod("meth");
    Annotation a 
   }    
}

