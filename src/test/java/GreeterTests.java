import greet.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import greet.Greeter;
import org.junit.jupiter.api.Test;


public class GreeterTests {

    @Test
    public void shouldReturnGreetingViaCommands() {

        Greeted greeted = new Greeted();
        Greeter greeter = new Greeter();
        Commands commands = new Commands(greeter, greeted);

        assertEquals("Hallo Warwick", greeter.greet("Warwick", Languages.AFRIKAANS));
        assertEquals("Molo Sbu", greeter.greet("Sbu", Languages.ISIXHOSA));
        assertEquals("Hello Thabang", greeter.greet("Thabang", Languages.ENGLISH));

    }



//    @Test
//    public void scannerTest() {
//
//        Greeted greeted = new Greeted();
//        Greeter greeter = new Greeter();
//        Commands commands = new Commands(greeter, greeted);
//
//        InputOutput inputOutput= new InputOutput();
//
//        String input = "add 5";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        assertEquals("add 5", inputOutput.getInput());
//
//    }

}
