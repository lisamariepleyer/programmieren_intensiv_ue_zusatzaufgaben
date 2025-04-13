package uebung2;

public class Multiplikationstabelle {
    public static void main(String[] args) {
        int size = 10;
        int printSpace = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                int result = row * col;

                String resultString = Integer.toString(result);
                if (result % 3 == 0) {
                    resultString = "*";
                }

                for (int i = 0; i < printSpace - resultString.length(); i++) {
                    System.out.print(" ");
                }

                System.out.print(resultString);
            }
            System.out.println();
        }
    }
}
