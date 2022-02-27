package objectclass;

class Person {
    private String name;
    public String getName(){ return  name;}
    public void  setName(String name){ this.name=name;}

    public String toString(){
        return " Hi, i'am " + this.name;
    }
}

public class ObjectClass {
    public  static String print(Person o){
        return o.toString();
    }

    public static void main(String[] args) {
        Person someone=new Person();
        someone.setName("Bruno");
        System.out.println(print(someone));
    }
}
