package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilograms, and the program calculates
 * the weight in grams.
 */
public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOGRAMS_IN_GRAMS = 1000;
        int weightInKilograms = 0;
        int weightInGrams = 0;

        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κίλα");
        weightInKilograms = scanner.nextInt();
        weightInGrams = weightInKilograms * KILOGRAMS_IN_GRAMS;

        System.out.printf("Το βάρος σε γραμμάρια των %d κιλών είναι: %,d γραμμάρια", weightInKilograms, weightInGrams);
    }
}
