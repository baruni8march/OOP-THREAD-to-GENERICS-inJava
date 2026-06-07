interface Work{
    int doIt(int x);
}
enum Task implements Work{
  ADD{
    public int doIt(int a){
        return a+x;
    }
  },MUL{
    public int doIt(int a){
        return a*x;
    }
  },SUB{
    public int doIt(int a){
        return x-a-1;
    }
  };
  int x=5;
  

}
public class AQ2{
    static void test(Work w){
        IO.println(w.doIt(4));
    }

    public static void main(String[] args){
        test(Task.ADD);
        test(Task.MUL);

        for(Task t : Task.values()){
            IO.println(t.name() + ":" + t.doIt(3));
        }
    }
}