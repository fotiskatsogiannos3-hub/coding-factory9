package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 *  Create a message that contains the name of the user and the age.
 */
public class StrConcat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age;
        String message = "";

        System.out.println("Please enter your fist name: ");
        firstname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Call a service method
        message = createMessage(firstname, age);

        //Εκτύπωση αποτελεσμάτων
        System.out.println(message);
    }

    /**
     * Create message tha contains the name of the user and the age.
     * @param firstname     the user's first name.
     * @param age           the user's age.
     * @return              the message.
     */
    public static String createMessage(String firstname, int age) {
        return String.format("Hello my name is %s and I am %d years old.", firstname, age);
    }


}
