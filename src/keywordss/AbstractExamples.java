package keywordss;

abstract class Animal {
    public void eat(){
        System.out.println("the animals eat much food");
    }
    abstract void move();
}
/*----------------*/
class Dog extends Animal{
    public void move(){
        System.out.println("the dog walks around");
    }
    public void bag(){
        System.out.println("the dog look cute to get food");
    }
}
public class AbstractExamples {
    public static void main(String[] args) {
        Dog myDog= new Dog();
        myDog.eat();
        myDog.move();
        myDog.move();
    }
}
