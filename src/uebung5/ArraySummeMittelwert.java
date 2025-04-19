package uebung5;

public class ArraySummeMittelwert {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        int sum = calculateSum(numbers);
        System.out.println("Summe: " + sum);

        double mean = calculateMean(numbers);
        System.out.println("Mittelwert: " + mean);
    }

    private static int calculateSum(int[] numbers) {
        int summe = 0;

        for (int n : numbers) {
            summe += n;
        }

        return summe;
    }

    private static double calculateMean(int[] numbers) {
        return (double) calculateSum(numbers) / numbers.length;
    }
}
