package uebung5;

public class Namensgebung {
    public static void main(String[] args) {
        String[] girlsNames = {"Emma", "Lina", "Mia", "Leonie", "Sofia"};
        String[] boysNames = {"Lukas", "Finn", "Ben", "Paul", "Noah"};

        String girlName = chooseName(girlsNames);
        System.out.println("Mädchenname: " + girlName);

        String boyName = chooseName(boysNames);
        System.out.println("Bubenname: " + boyName);
    }

    private static String chooseName(String[] names) {
        int zufallsZahl = (int)(Math.random() * names.length);
        return names[zufallsZahl];
    }
}
