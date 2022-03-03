package conditional;

public class ConditionalBocks {
    /*public static void main(String[] args) {
        boolean b = false;

        if (b){
            System.out.println("inside if statement");
        }
        else {
            System.out.println("inside the else statement");
        }
        System.out.println("outside the if statement");
    }*/

    public static void main(String[] args) {
        boolean firstCondition = true;
        boolean secondCondition = true;

        if (firstCondition){
            System.out.println("insided the if statement");
        }
        if (secondCondition){
            System.out.println("nested if");
        }else {
            System.out.println("outsite of the if-statement");
        }

    }
}
