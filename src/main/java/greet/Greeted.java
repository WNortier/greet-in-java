package greet;

import java.util.*;

public class Greeted {

    private List<String> greetedPersons = new ArrayList<String>();

    public void addPerson(String name) {
        greetedPersons.add(name);
    }

    public int getGreetedCount() {
        return this.greetedPersons.size();
    }

    public static void countFrequencies(ArrayList<String> greetedPersons) {
        Set<String> st = new HashSet<String>(greetedPersons);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(greetedPersons, s));
    }
}
