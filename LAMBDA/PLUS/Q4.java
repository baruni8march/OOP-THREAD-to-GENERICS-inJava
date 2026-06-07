// Q4.java
// Complete only the TODO parts.
// Topic: constructor reference, array constructor reference, object instance method reference.

import java.util.function.Function;
import java.util.function.Predicate;

// TODO-1: Write functional interface TicketFactory.
// Its method must receive one String code and return a Ticket.
interface TicketFactory{
    Ticket make(String code);
}

// TODO-2: Write functional interface TicketArrayFactory.
// Its makeod must receive one int size and return Ticket[].
interface TicketArrayFactory{
    Ticket[] make(int size);
}
class Ticket {
    // TODO-3: Add one private String field named code.
       private String code;
    // TODO-4: Write constructor Ticket(String code).
       Ticket(String code){
        this.code=code;
       }
    // TODO-5: Write getCode() method.
    String getCode(){
        return code;
    } 
}

class TicketPrinter {
    //TODO-6: Write instance method format(Ticket t).
    // Format: "T-" + uppercase ticket code
       String format(Ticket t){
        return "T-"+t.getCode().toUpperCase();
       }
}

public class Q4 {
    public static void main(String[] args) {
        TicketFactory makeTicket = Ticket::new;
        TicketArrayFactory makeArray = Ticket[]::new;

        String[] codes = {"a7", "b2", "x9"};
        Ticket[] tickets = makeArray.make(codes.length);

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = makeTicket.make(codes[i]);
        }

        TicketPrinter printer = new TicketPrinter();
        Function<Ticket, String> format = printer::format;

        // TODO-7: Complete this lambda expression.
        // It must return true only when the formatted ticket contains "B".
        Predicate<Ticket> hasB = (s)->{
                 if(s[0]=='b'){
                    return true;
                 }
        }
        for (Ticket ticket : tickets) {
            System.out.println(format.apply(ticket));
        }
        System.out.println("Middle has B: " + hasB.test(tickets[1]));
    }
}
