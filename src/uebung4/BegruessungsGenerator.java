package uebung4;

import java.util.Scanner;

public class BegruessungsGenerator {
    public static void main(String[] args) {
        String[] greeetings = {"hi", "hello", "nice to see you"};
        String[] names = getNames();

        printRandomGreetings(names, greeetings);
    }

    private static void printRandomGreetings(String[] names, String[] greeetings) {
        for (String n : names) {
            String greeting = greeetings[(int)(Math.random() * (greeetings.length))];
            System.out.println(greeting + " " + n);
        }
    }

    private static String[] getNames() {
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = getName();
        }

        return names;
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name?:");

        return scanner.nextLine();
    }
}
