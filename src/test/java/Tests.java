import greet.Greet;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

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
