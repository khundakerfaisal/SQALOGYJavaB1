package OOPClass;

public class activityProgram {

}

class Human{
    String hand;
    String Leg;
    String Eye;

    public void handActivity(){
        System.out.println("We can write");
    }
    public void EyeActivity(){
        System.out.println("We can see");
    }

    public static void main(String[] args) {
        Human human=new Human();
        human.handActivity();
        human.EyeActivity();
    }

}
