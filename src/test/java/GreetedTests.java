import greet.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import greet.Greeted;
import org.junit.jupiter.api.Test;

public class GreetedTests {

    @Test
    public void shouldAddGreetedPerson() {
        Greeter greeter = new Greeter();
        Greeted greeted = new Greeted();
        greeter.greet("Warwick", Languages.ENGLISH);
        greeter.greet("Mike", Languages.ENGLISH);
        assertEquals(2, greeted.getGreetedCount());
    }
}
