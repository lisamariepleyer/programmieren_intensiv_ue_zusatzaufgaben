package uebung1;

import java.util.Scanner;

public class Zahlenanalyse {
    public static void main(String[] args) {
        int zahl = askforNumber();

        System.out.println(getVorzeichen(zahl));
        System.out.println(getEvenOrOdd(zahl));
    }

    private static String getVorzeichen(int z) {
        if (z < 0) {
            return "negativ";
        } else {
            return "positiv";
        }
    }

    private static String getEvenOrOdd(int z) {
        if (z % 2 == 0) {
            return "gerade";
        } else {
            return "ungerade";
        }
    }

    private static int askforNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl: ");

        return scanner.nextInt();
    }
}
