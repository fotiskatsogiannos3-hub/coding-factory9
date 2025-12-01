package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {
        int a = 2;
        int n = 4;
        System.out.println(pow(a,n));

    }

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * pow(a, n - 1);
    }
}
