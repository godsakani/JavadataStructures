package keywordss;

public class StaticExamples {
    static int Counter=1;
    int num=0;

    public StaticExamples(){
        Counter++;
        num++;
    }
}
class StaticDemo{
    public static void main(String[] args) {

        StaticExamples instanceA = new StaticExamples();
        System.out.println("instanceA counter " + instanceA.Counter);
        System.out.println("instanceA num " + instanceA.num);

        StaticExamples instanceB = new StaticExamples();
        System.out.println("instanceB Counter " + instanceB.Counter);
        System.out.println("instanceB num " + instanceB.num);

    }
}