package uebung1;

import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        askQuestion();

        int zufallsZahl = (int)(Math.random() * 5);
        System.out.println(getAnswer(zufallsZahl));
    }

    private static String getAnswer(int z) {
        switch(z) {
            case 0:
                return "Ja";
            case 1:
                return "Sehr wahrschienlich";
            case 2:
                return "Frag später nochmal";
            case 3:
                return "Sieht nicht gut aus";
            case 4:
                return "Meine Antwort ist nein";
            default:
                return "";
        }
    }

    private static void askQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stellen Sie eine Ja/Nein Frage: ");

        scanner.hasNext();
    }
}
