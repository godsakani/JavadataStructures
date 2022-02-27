package examples;

public class ArrayExample {
    public static void main(String[] args) {
        int[] firstArray = new int[4];
        int[] secArray = {2,3,4};

        firstArray[0]=1;
        firstArray[1]=3;
        firstArray[2]=5;

        System.out.println("The value of the firstArray[1] is" + firstArray[1]);
        System.out.println("The length of the the secArray is" +secArray.length);
    }
}
