package greet;

public class Greeter extends Greeted {

    public String greet(String name, Languages language){
        super.addPerson(name);

        StringBuilder greetingMessage = new StringBuilder("");
        greetingMessage.delete(0, greetingMessage.toString().length());

        if (language.equals(Languages.ENGLISH)) {
            greetingMessage.append("Hello ").append(name);
        } else if (language.equals(Languages.AFRIKAANS)) {
            greetingMessage.append("Hallo ").append(name);
        } else if (language.equals(Languages.ISIXHOSA)) {
            greetingMessage.append("Molo ").append(name);
        }
        return greetingMessage.toString();
    }
}

//import java.util.ArrayList;
//        import java.util.List;

//    public int getGreetedCount() {
//        return this.names.size();
//    }

//    private List<String> names = new ArrayList<>();