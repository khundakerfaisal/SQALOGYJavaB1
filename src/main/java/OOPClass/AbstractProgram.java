package OOPClass;

public class AbstractProgram {
    public static void main(String[] args) {
        Orange orange=new Orange();
        orange.taste();
        Apple apple=new Apple();
        apple.taste();
    }

}
abstract class Fruits{
    abstract void taste();

}
class Apple extends Fruits{
    void taste(){
        System.out.println("Apple taste is sweet");
    }
}
class Orange extends Fruits{
    void taste(){
        System.out.println("Orange taste is sour");
    }
}

