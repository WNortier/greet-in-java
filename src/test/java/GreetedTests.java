import greet.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import greet.Greeted;
import org.junit.jupiter.api.Test;

public class GreetedTests {

    @Test
    public void should(){
        Greeted greeted = new Greeted();
        Greeter greeter = new Greeter();
        greeter.greet("Warwick", Languages.AFRIKAANS);
        greeter.greet("Warwick", Languages.ENGLISH);
        greeter.greet("Mike", Languages.ENGLISH);
        assertEquals(3, greeted.getGreetedCount());
        System.out.println(greeted.getGreetedCount());

    }
}
