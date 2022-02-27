package examples;

public class VariableExample {
    public static void main(String[] args) {
    boolean myBoolean = false;
    byte myByte = 2 ;
    short myShort = 3;
    char myChar = 'b';
    int myInt = 6;
    double myDouble = 0.53d;
    long myLong = 9999999999l;
    float myFloat = 0.26f;
    String myString="Love food and sleep";
    //
        System.out.println("2 + 3 =" +(myByte + myShort));
        myBoolean = myInt < 8;
        System.out.println("Is myInt < 8" + myBoolean);
        System.out.println("simple division is (myLong/myFloat)");
        System.out.println(myLong/myFloat);
        System.out.println(myString);
        System.out.println("How you doing B"+myChar);
    }
}
