package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απολύτο ενός ακεραίου μετη χρήση του
 * τραιδικού τελεστή.Το απόλυτο ενός ακεραίου είναι θετικός
 * αριθμός. Για παράδειγμα το απόλυτο του -5 είναι 5 και το
 * απόλυτο του 5 είναι 5.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int abs = 0;

        //Input - Είσοδος Δεδομένων
        System.out.println("Please give a number: ");
        num = scanner.nextInt();  //Data binding

//        //Επεξεργασία Δεδομένων
//        if (num >= 0){
//            abs = num;
//        }else{
//            abs = -num;
//        }

        abs = (num >= 0) ? num : -num;   //expression Syntactic Sugar

    }
}
