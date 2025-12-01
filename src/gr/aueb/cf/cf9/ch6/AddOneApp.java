package gr.aueb.cf.cf9.ch6;

/**
 * 'Εστω ότι αναπαριστούμε μεγάλους ακεραίους σε μορφή
 * πίνακα. Θέλουμε να προσθέσουμε την μονάδα.
 */
public class AddOneApp {

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] arrOut;
        arrOut = addOne(arr);

        for (int item: arrOut) {
            System.out.print(item + "");
        }
    }

    /**
     * Προσθέτει τη μονάδα σε ένα πίνακα που
     * αναπαριστά ένα ακέραιο.
     * @param arr  ο input πίνακας
     * @return     ένα array με το αποτέλεσμα.
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] arrOut = new int[arr.length + 1];
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }
        return arrOut;
    }
}
