package OOPClass;

public interface interfaceProgram {
    public void taste();
}
interface interfaceProgram2 {
    public void sweet();
}

class Allactivity implements interfaceProgram,interfaceProgram2{
    public void taste(){
        System.out.println("graph is sweet");
    }
    public void sweet(){
        System.out.println("Laddu is so tasty");
    }
}
class Main{
    public static void main(String[] args) {
        Allactivity allActivity=new Allactivity();
        allActivity.sweet();
        allActivity.taste();
    }
}
