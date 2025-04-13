package uebung3;

public class Segeln {
    public static void main(String[] args) {
        int numberOfValues = 3;

        int[] windSpeed = generateRandomValues(numberOfValues, 200);
        int[] windDirection = generateRandomValues(numberOfValues, 360);

        for (int i = 0; i < numberOfValues; i++) {
            System.out.print("Wind speed ");
            System.out.print(windSpeed[i]);
            System.out.print(" km/h and wind direction ");
            System.out.print(windDirection[i]);
            System.out.print("º");
            System.out.println();
        }
    }

    private static int[] generateRandomValues(int numberOfValues, int maxValue) {
        int[] values = new int[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            // generates number between 0 and maxValue inclusive.
            values[i] = (int)(Math.random() * (maxValue + 1));
        }

        return values;
    }
}
