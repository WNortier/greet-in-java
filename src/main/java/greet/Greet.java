package greet;

public class Greet {

    public String greet() {
        return "hello world!";
    }

    public int greetCount(){
        return 3;
    }

    public static void main(String[] args) {
        Greet greeting = new Greet();
        greeting.greet();
    }

}
