import greet.Greet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void shouldReturnGreeting(){
        Greet greet = new Greet();
        assertEquals("hello world!", greet.greet());
    }

    @Test
    public void shouldReturnCount(){
        Greet greet = new Greet();
        assertEquals(3, greet.greetCount());
    }
}
