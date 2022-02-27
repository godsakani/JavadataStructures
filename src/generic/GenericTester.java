package generic;

public class GenericTester {
    public static void main(String[] args) {
        GenericExamples<String> myDemo = new GenericExamples();
        myDemo.put("This is my favorite demo");

        System.out.println(myDemo.get());
    }
}
