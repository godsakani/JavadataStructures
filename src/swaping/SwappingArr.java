package swaping;

public class SwappingArr {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5};
        //storing the arrays
        int temp = elements[0];
        //swapping the element
        elements[0]=elements[elements.length-1];

        elements[elements.length-1]=temp;

        //printing them out

        for (int i=0;i<elements.length;i++){
            System.out.println(elements[i]);
        }
    }
}
