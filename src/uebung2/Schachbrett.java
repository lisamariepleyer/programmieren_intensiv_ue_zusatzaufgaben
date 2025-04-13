package uebung2;

public class Schachbrett {
    public static void main(String[] args) {
        int size = 8;
        String[] signs = {"#", "O"};

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(signs[((row + col) % 2)]);
            }
            System.out.println();
        }
    }
}
