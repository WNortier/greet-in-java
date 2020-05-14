import greet.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import greet.Greeter;
import org.junit.jupiter.api.Test;


public class GreeterTests {

    @Test
    public void shouldReturnGreetingViaCommands() {

        Greeted greeted = new Greeted();
        Greeter greeter = new Greeter();

        assertEquals("Hallo Warwick", greeter.greet("Warwick", Languages.AFRIKAANS));
        assertEquals("Molo Sbu", greeter.greet("Sbu", Languages.ISIXHOSA));
        assertEquals("Hello Thabang", greeter.greet("Thabang", Languages.ENGLISH));

        assertEquals(3, greeted.getGreetedCount());

    }
}
