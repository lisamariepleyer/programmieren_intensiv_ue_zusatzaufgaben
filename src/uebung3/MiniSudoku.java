package uebung3;

public class MiniSudoku {

    public static void main(String[] args) {
        int[][] block1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] block2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 8 }
        };

        int[][] block3 = {
                { 3, 2, 6 },
                { 4, 9, 1 },
                { 8, 8, 9 }
        };

        printMissingNumber(checkBlock(block1), "block 1");
        printMissingNumber(checkBlock(block2), "block 2");
        printMissingNumber(checkBlock(block3), "block 3");
    }

    private static void printMissingNumber(boolean[] seen, String name) {
        for(int i = 0; i < seen.length; ++i){
            if (!seen[i]) {
                System.out.println(name + " is missing " + (i + 1));
            }
        }
    }

    private static boolean[] checkBlock(int[][] block) {
        // create list of booleans indicating whether number was seen
        boolean[] seen = new boolean[9];
        for(int i = 0; i < seen.length; ++i){
            seen[i] = false;
        }

        for (int[] row : block) {
            for (int num : row) {
                seen[num - 1] = true;
            }
        }

        return seen;
    }

}
