package uebung3;

import java.util.Scanner;

public class Eisgeschaeft {
    public static void main(String[] args) {
        String flavours[] = new String[askForNumberOfFlavours()];

        for (int i = 0; i < flavours.length; i++) {
            flavours[i] = askForFlavour();
        }

        printInOrder(flavours);
        System.out.println();
        printInrversedOrder(flavours);
    }

    private static void printInOrder(String[] flavours) {
        for (int i = 0; i < flavours.length; i++) {
            System.out.println(flavours[i]);
        }
    }

    private static void printInrversedOrder(String[] flavours) {
        for (int i = (flavours.length - 1); i > (0 - 1); i--) {
            System.out.println(flavours[i]);
        }
    }

    private static String askForFlavour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eissorte: ");

        return scanner.nextLine();
    }

    private static int askForNumberOfFlavours() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Eissorten? ");

        return scanner.nextInt();
    }
}
