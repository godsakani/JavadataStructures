package polymorphism;

public class PolymorphismExamples {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myDog.eat();

        System.out.println(myDog.hasfur);
    }
}
class Animal{
    public boolean hasfur = false;
    public void eat(){
        System.out.println("i eat food");
    }
}
class Dog extends Animal{
    public boolean hasfur = true;
    public void eat(){
        System.out.println("i eat kibble");
    }
    public void bark(){
        System.out.println("woof!");
    }
}