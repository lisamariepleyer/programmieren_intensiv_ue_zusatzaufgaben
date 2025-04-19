package uebung4;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] randomWords = {"Affe", "Pferd", "Lama", "Joghurt", "Brille"};
        int maxTries = 10;

        String word = chooseWord(randomWords);
        char[] guessedLetters = new char[maxTries];

        for (int currentTry = 0; currentTry < maxTries; currentTry++) {
            printWordPlaceholder(word, guessedLetters);

            char letter = getLetter();
            guessedLetters[currentTry] = letter;

            if (hasGuessedAllLetters(word, guessedLetters)) {
                System.out.println("Gewonnen! Das gesuchte Wort ist " + word);
                break;
            }
        }

        if (!hasGuessedAllLetters(word, guessedLetters)) {
            System.out.println("Verloren! Das gesuchte Wort war " + word);
        }
    }

    private static String chooseWord(String[] words) {
        int randomNumber = (int)(Math.random() * words.length);
        return words[randomNumber];
    }

    private static char getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Buchstabe? ");
        return Character.toLowerCase(scanner.next().toCharArray()[0]);
    }

    private static boolean[] getCorrectGuesses(String word, char[] guessedLetters) {
        boolean[] hasGuessedCorrectly = new boolean[word.length()];

        for (int ci = 0; ci < word.length(); ci++) {
            boolean hasGuessed = false;

            for (char l : guessedLetters) {
                // Note for advanced students: this could be solved in multiple (cleverer!) ways
                // see https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java
                if (l == Character.toLowerCase(word.charAt(ci))) {
                    hasGuessed = true;
                    break;
                }
            }

            hasGuessedCorrectly[ci] = hasGuessed;
        }

        return hasGuessedCorrectly;
    }

    private static void printWordPlaceholder(String word, char[] guessedLetters) {
        boolean[] hasGuessedCorrectly = getCorrectGuesses(word, guessedLetters);

        for (int g = 0; g < word.length(); g++) {
            if (hasGuessedCorrectly[g]) {
                System.out.print(word.charAt(g));
            } else {
                System.out.print("_");
            }
        }

        System.out.println();
    }

    private static boolean hasGuessedAllLetters(String word, char[] guessedLetters) {
        boolean[] hasGuessedCorrectly = getCorrectGuesses(word, guessedLetters);

        for (boolean g : hasGuessedCorrectly) {
            if (!g) {
                return false;
            }
        }

        return true;
    }
}
