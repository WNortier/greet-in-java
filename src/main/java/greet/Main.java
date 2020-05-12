package greet;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeted greeted = new Greeted();

        Commands commands = new Commands(greeter, greeted);
        commands.runProgram();
    }
}
