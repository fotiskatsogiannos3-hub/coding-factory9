package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 *  This program calculates if a number is even
 */
public class EvenApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποιήση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Είσοδος Δεδομένων
        System.out.println("Please give a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please give a number: ");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //Επιχειρησιακή Λογική - Παραστάσεις
        result = isEven(num);

        //Εκτύπωση αποτελέσματος
        System.out.println("The number is even: " + result);
    }

    /**
     * Checks if a number is even
     * @param num the number to check
     * @return  tru if the number is even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
