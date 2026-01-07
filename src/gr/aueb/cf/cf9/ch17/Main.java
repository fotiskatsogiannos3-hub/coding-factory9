package gr.aueb.cf.cf9.ch17;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode();

        // No compile-time safety
        flexibleNode.setValue("Coding");
        int value = (int)flexibleNode.getValue();

        System.out.println(value);
    }
}
