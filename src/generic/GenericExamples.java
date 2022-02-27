package generic;

public class GenericExamples <T>{
    private  T contents;

    public GenericExamples(){}

    public GenericExamples(T in){
        this.contents=in;
    }
    public  void put(T in){
        this.contents=in;
    }
    public  T get(){
        return contents;
    }
}
