package uebung2;

import java.util.Scanner;

public class TribonacciFolge {
    public static void main(String[] args) {
        int n = askForNumber();
        int tribonacciFolge[] = getTribonacciFolge(n);

        // Uebung 2
        System.out.println(tribonacciFolge[n]);

        // Uebung 3
        System.out.println();
        for (int z : tribonacciFolge) {
            System.out.println(z);
        }
    }

    private static int[] getTribonacciFolge(int n) {
        int nthElement = n + 1;
        int folgeStart[] = {0, 1, 1};
        int magicNumber = folgeStart.length;

        int folge[] = new int[Math.max(nthElement, magicNumber)];

        for (int i = 0; i < magicNumber; i++) {
            folge[i] = folgeStart[i];
        }

        if (nthElement > magicNumber) {
            for (int i = magicNumber; i < nthElement; i++) {
                folge[i] = (folge[i - 3] + folge[i - 2] + folge[i - 1]);
            }
        }

        return folge;
    }

    private static int askForNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Die wievielte Zahl der Tribonacci Folge möchten Sie berechnen? ");

        return scanner.nextInt();
    }
}
