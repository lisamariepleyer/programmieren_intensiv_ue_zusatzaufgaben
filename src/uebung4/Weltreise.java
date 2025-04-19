package uebung4;

import java.util.Scanner;

public class Weltreise {
    public static void main(String[] args) {
        int[][] distances = {
                {0, 100, 200, 300, 400},
                {100, 0, 100, 200, 300},
                {200, 100, 0, 100, 200},
                {300, 200, 100, 0, 100},
                {400, 300, 200, 100, 0}
        };

        String[] cities = getCities();

        for (int a = 0; a < cities.length - 1; a ++) {
            for (int b = a + 1; b < cities.length; b ++) {
                printResults(cities[a], cities[b], distances[a][b], 100);
            }
        }
    }

    private static void printResults(String cityA, String cityB, double distance, double velocity) {
        System.out.println(
                "The distance between " +
                        cityA +
                        " and " +
                        cityB +
                        " is " +
                        distance +
                        "km. With a velocity of " +
                        velocity +
                        "km/h the estimated traveling time is " +
                        distance/velocity +
                        "h."
        );
    }

    private static String[] getCities() {
        String[] cities = new String[5];

        for (int i = 0; i < cities.length; i++) {
            cities[i] = getCity();
        }

        return cities;
    }

    private static String getCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("City?:");

        return scanner.nextLine();
    }
}
