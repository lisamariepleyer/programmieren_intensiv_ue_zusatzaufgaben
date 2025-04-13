package uebung1;

import java.util.Scanner;

public class Day2Number {
    public static void main(String[] args) {
        String day = askforDay();

        String daynumber = getNumber(day);
        if (daynumber != null) {
            System.out.println(daynumber);
        }
    }

    private static String getNumber(String day) {
        switch (day) {
            case "Montag":
                return "1";

            case "Dienstag":
                return "2";

            case "Mittwoch":
                return "3";

            case "Donnerstag":
                return "4";

            case "Freitag":
                return "5";

            case "Samstag":
                return "6";

            case "Sonntag":
                return "7";

            default:
                System.out.println(day + " ist kein gültiger Wochentag!");
                return null;
        }
    }

    private static String askforDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wochentag: ");

        return scanner.nextLine();
    }
}
