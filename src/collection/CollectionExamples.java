package collection;

import java.util.ArrayList;

public class CollectionExamples {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Hello");
        arrList.add("");
        arrList.add("Andrew");
        arrList.add(3,"1");

        System.out.println("the index at 2 is " + arrList.get(2));
        System.out.println(arrList);
    }
}
