// import java.lang.annotation.*;
// import java.lang.reflect.*; //to get method
// @Retention(RetentionPolicy.RUNTIME) //v.imp
// @interface A{int m();}
// @Retention(RetentionPolicy.RUNTIME) //v.imp
// @interface B{String m();}
// @Retention(RetentionPolicy.RUNTIME) //v.imp
// @interface C{} //marker annotation
// @Retention(RetentionPolicy.RUNTIME) //v.imp
// @interface D{int value();}// it must be value named method to make single single value annotation
// @Retention(RetentionPolicy.RUNTIME) //v.imp
// @interface E{int value(); String m() default "EEE";}

// @Retention(RetentionPolicy.RUNTIME) 
// @Target(ElementType.TYPE_USE) //used to annotate type 
// @interface F{int value();}


// @Retention(RetentionPolicy.RUNTIME)
// @Repeatable(H.class) 
// @interface G{int value();}// G is repeatable annotation

// @Retention(RetentionPolicy.RUNTIME)
// @interface H{G[] value();} //H is container annotation used to collect repeatable G array annotations


// // @Retention(RetentionPolicy.RUNTIME)
// // @Repeatable(P.class)
// // @interface S{int val();}

// // @Retention(RetentionPolicy.RUNTIME)
// // @interface P{S[] value();}
// @A(m=10)
// @B(m="hello")
// @C  //marker annotation
// @D(100)//single value annotation:using value() method helps to not to use m=100 thing only passing the argument is enough
// @E(20)
// class AA{
// //now to add annotation on method

// @A(m=10)
// @B(m="hello")
// @C  
// @D(100)
// @E(20)
// //to add built-in annotation
// @Deprecated(forRemoval = true,since="sneha")//deprecated anno means this is old and its better to not use this
// // @Override : cannot use it as its actually not overriding m method from any superclass
// @G(1) @G(2) @G(3) //repeatable annotation
// void m(@F(300) @D(100) int i){ //to annotate a parameter
//   //ekhane duita annotation thakleo F kaj korbe typer upor and D kaj korbe fielder upor just because of the use of Target on F annotation

// }

// }
// public class lab1602{
//     public static void main(String[] args) throws NoSuchMethodException{
//        Class<?> aaclass=AA.class; //process of taking object of class 
//        //similar to Class aaclass=AA.class; but Class<?> makes it safer
//        //it means taking object of Class type but <?> means we dont know what type it is and =AA.class means we are taking the object of class AA


//     //    A annotation=aaclass.getAnnotation(A.class);
//     //    IO.println("Annotation present:"+annotation);// it prints null because we are printing during runtime and we havent applied any retention policy at the annotation yet
//     //    //and this prints: @A(m=10) but to see the value manually:
//     //    IO.println("Annotation value:"+annotation.m());

//     for(Annotation a:aaclass.getAnnotations()){
//       IO.println("Annotation present:"+a);
    
//     }
//     IO.println();
//     Method m=aaclass.getDeclaredMethod("m",int.class); // method name,parameter
//     //still error showing because getmethod throws an exception of what if the method doesnt exist thus its imp to add throws NoSuchMethodException at the beginning of main method

//     for(Annotation a:m.getAnnotations()){
//       IO.println("Annotation present:"+a);
    
//     }
// IO.println();
// IO.println();
//     for(Parameter p:m.getParameters()){
//       for(Annotation a:p.getAnnotations()){
//         IO.println("ParameterAnnotation present:"+a); //eta i ke annotate korse but int type ke korenai

//       }
//       IO.println();
//       for(Annotation a:p.getAnnotatedType().getAnnotations()){ //to annotate integer type //still no output aswe havent used Target(ElementType.TYPE_USE) at the annotation
//         IO.println("ParameterTypeAnnotation present:"+a);

//       }
//     }
//    //but in the use of repeatable annotation output :@H({@G(1), @G(2), @G(3)}) so to only get G:
//   H h= m.getAnnotation(H.class);
//   for(G g:h.value()){
//     IO.println("RepeatAnno"+g.value());
//   }

// }}
void main(){
  char c=1220;
  IO.println(c);
}