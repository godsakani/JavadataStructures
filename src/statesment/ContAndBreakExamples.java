package statesment;

public class ContAndBreakExamples {
    public static void main(String[] args) {
        int count =0;
        while (count <=10){
         count++;
         if (count==7)
             break;

         if (count % 2==0)
             continue;
         else
             System.out.println(count);
        }
        System.out.println("The Continue and break loop");
    }
}
