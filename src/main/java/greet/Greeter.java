package greet;

public class Greeter extends Greeted {

    public String greet(String name, Languages language) {

        StringBuilder greeting = new StringBuilder("");
        greeting.delete(0, greeting.toString().length());
        addPerson(name);

        if (language.equals(Languages.ENGLISH)) {
            greeting.append("Hello ").append(name);
        } else if (language.equals(Languages.AFRIKAANS)) {
            greeting.append("Hallo ").append(name);
        } else if (language.equals(Languages.ISIXHOSA)) {
            greeting.append("Molo ").append(name);
        }
        return greeting.toString();
    }
}
