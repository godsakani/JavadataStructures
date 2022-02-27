package stringtypes;

public class StringMethodsExamples {
    public static void main(String[] args) {
        String stringA = "hello";
        String stringB = new String("Hello");

        System.out.println("String.length():\t\t" + stringA.length());
        System.out.println("String.toUpperCase():\t\t" + stringA.toUpperCase());
        System.out.println("String.toLowerCase():\t\t" + stringB.toLowerCase());
        System.out.println("String.Indexof();\t\t" + stringA.indexOf('l'));
        System.out.println("String.lastIndex():\t\t" + stringA.lastIndexOf('o'));
        System.out.println("String.charAt(4):\t\t" + stringA.charAt(4));
        System.out.println("\nstringA.equals(StringB):\t\t" + stringA.equals(stringB));
        System.out.println("\nstringA.equalsIgnoreCases(StringB):\t\t" + stringA.equalsIgnoreCase(stringB));
    }
}
