package inheritance;

public class InheritanceExamples {
    public static void makeItTalk(Animal input){
        input.speak();
    }
    public static void main(String[] args) {
      Animal myAnimal =new Animal();
      Dog myDog= new Dog();
      System.out.println("make the obect animal speaks");
      makeItTalk(myAnimal);

      System.out.println("make the object dog speak");
      makeItTalk(myDog);
    }
}
class Animal{
    public void speak(){
        System.out.println("Generic name noise");
    }
}
class Dog extends Animal{
    public void speak(){
        System.out.println("woof");
    }
}

