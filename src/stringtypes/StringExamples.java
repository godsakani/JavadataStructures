package stringtypes;

public class StringExamples {
    public static void main(String[] args) {
        String stringA= "Hello";
        String stringB = new String("Hello");

        System.out.println("String A " + stringA);
        System.out.println("string B " + stringB);

        if (stringA == stringB)
            System.out.println("string A and String B are point to the same object");
        else
            System.out.println("String A and String B do not point to the same Object");
    }
}
