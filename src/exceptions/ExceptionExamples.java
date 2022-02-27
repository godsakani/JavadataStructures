package exceptions;

public class ExceptionExamples {
    public static void main(String[] args) {
        try {
            System.out.println(" 1/0 " + (1/0));
        }catch (ArithmeticException e){
            System.out.println("caught an arithmetic exception");
            //print stack trace program
            e.printStackTrace();
        }finally {
            System.out.println("this is the optional\"final\"block.");
        }
        System.out.println("the caught has continue on, as normal!");
    }
}
