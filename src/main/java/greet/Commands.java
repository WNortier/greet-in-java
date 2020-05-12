package greet;

import java.util.Scanner;

public class Commands {

    Greeter greeter;
    Greeted greeted;

    public Commands(Greeter greeter, Greeted greeted) {
        this.greeter = greeter;
        this.greeted = greeted;
    }

    Scanner scanner = new Scanner(System.in);
    public boolean runProgram = true;

    public void runProgram() {
        while (runProgram) {
            System.out.println("Enter a command to begin: (greet, greeted, counter, exit, clear, help)");
            String command = scanner.nextLine();

            switch (command){
                case "greet" : {
                    System.out.println("Please enter name to greet");
                    String name = scanner.nextLine();
                    System.out.println("Please choose a language");
                    String language = scanner.nextLine().toUpperCase();
                    System.out.println(greeter.greet(name, Languages.valueOf(language)));
                    this.endProgram();
                    break;
                }
                case "greeted" : {

                }
            }
        }
    }

    private void endProgram(){
        this.runProgram = false;
        scanner.close();
        System.out.println();
        System.out.println("Exiting Program");
    }
}
