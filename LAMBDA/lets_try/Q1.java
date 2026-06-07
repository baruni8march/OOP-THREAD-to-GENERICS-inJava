class InvalidValueException extends Exception{
    InvalidValueException(String s){
        super(s);
    }
}

interface F{
    int m() throws InvalidValueException;
}

public class Q1{
    public static void main(String[] args){

        int x = -5;

        F f = ()->{
            if(x<0){
                throw new InvalidValueException("Invalid value: " + x);
            }
            return x;
        };

        try{
            IO.println(f.m());
        }
        catch(InvalidValueException e){
            IO.println(e.getMessage());
        }
    }
}