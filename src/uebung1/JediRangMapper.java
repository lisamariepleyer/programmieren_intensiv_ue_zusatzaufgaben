package uebung1;

import java.util.Scanner;

public class JediRangMapper {
    public static void main(String[] args) {
        int age = askforAge();
        String rang = getRang(age);
        System.out.println(rang);
    }

    private static String getRang(int age) {
        if (age < 18) {
            return "Youngling";
        } else if (age < 30) {
            return "Padawan";
        } else if (age < 50) {
            return "Jedi Knight";
        } else if (age < 80) {
            return "Jedi Master";
        } else {
            return "Grand Master";
        }
    }

    private static int askforAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alter: ");

        return scanner.nextInt();
    }
}
