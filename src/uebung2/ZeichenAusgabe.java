package uebung2;

import java.util.Scanner;

public class ZeichenAusgabe {
    public static void main(String[] args) {
        String s = getString();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("?: ");
        return scanner.nextLine();
    }
}
