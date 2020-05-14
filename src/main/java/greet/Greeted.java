package greet;

import java.util.*;

public class Greeted {

    private List<String> list = new ArrayList<>();

    public void addPerson(String name) {
        list.add(name);
    }

    public int getGreetedCount() {
        return this.list.size();
    }

    public void countFrequencies(ArrayList<String> greetedPersons) {
        Set<String> st = new HashSet<String>(greetedPersons);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(greetedPersons, s));
    }
}

