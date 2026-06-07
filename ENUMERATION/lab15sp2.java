interface Work{
    void doWork();
}

enum Day implements Work{
    FRIDAY, SATURDAY, SUNDAY;

    public void doWork(){
        IO.println(this + " working");
    }
}

public class lab_enum1{
    public static void main(String[] args){
        Day d = Day.FRIDAY;
        d.doWork();

        for(Day x : Day.values()){
            x.doWork();
        }
    }
}