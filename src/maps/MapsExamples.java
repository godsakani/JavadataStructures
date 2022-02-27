package maps;

import java.util.HashMap;

public class MapsExamples {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"Ninistis");
        myMap.put(2,"Dorabon");
        myMap.put(3,"Fienora");
        myMap.put(4,"food");

        System.out.println("The index of the map at 4 is " + myMap.get(4));
    }
}
