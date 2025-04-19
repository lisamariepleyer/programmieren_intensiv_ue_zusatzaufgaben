package uebung5;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        int a = leseZahl();
        int b = leseZahl();

        int summe = addieren(a, b);
        System.out.println("Summe: " + summe);

        int produkt = multiplizieren(a, b);
        System.out.println("Produkt: " + produkt);

        double quotient = dividieren(a, b);
        System.out.println("Quotient: " + quotient);

        int maximum = findeMaximum(a, b);
        System.out.println("Maximum: " + maximum);

        double mittelwert = findeMittelwert(a, b);
        System.out.println("Mittelwert: " + mittelwert);
    }

    private static int leseZahl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl: ");
        return scanner.nextInt();
    }

    private static int addieren(int a, int b) {
        return a + b;
    }

    private static int multiplizieren(int a, int b) {
        return a * b;
    }

    private static double dividieren(int a, int b) {
        // define type, otherwise an integer division is performed and type conversion happens only AFTER calculation
        return (double) a / b;
    }

    private static int findeMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    private static double findeMittelwert(int a, int b) {
        // define type, otherwise an integer division is performed and type conversion happens only AFTER calculation
        return (double) addieren(a, b) / 2;
    }
}
