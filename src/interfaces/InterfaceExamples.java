package interfaces;

public class InterfaceExamples {
    public static void main(String[] args) {
        Doministicated doministicatedThings = new Dog();

        doministicatedThings.doWork();

    }
}
interface Doministicated{
    public void doWork();
}
class Animal{
    public void eat(){
        System.out.println("i eat food");
    }
}
class Wolf extends Animal{
    public void eat(){
        System.out.println("I eat fresh meat");
    }
}
class Dog extends Animal implements Doministicated{
    public void eat(){
        System.out.println("i eat Kibble");
    }

    @Override
    public void doWork() {
        System.out.println("i performed a trick");
    }
}
