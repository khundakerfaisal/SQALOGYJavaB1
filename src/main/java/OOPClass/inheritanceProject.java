package OOPClass;

public class inheritanceProject {
    public static void main(String[] args) {
        cycle cycle=new cycle();
        cycle.wheel();
        cycle.sound();
    }
}

class Vehicle{
    public void wheel(){
        System.out.println("Vehicle has wheel");
    }
    public void sound(){
        System.out.println("Vehicle has sound");
    }
    public void Engine(){
        System.out.println("Vehicle has Engine");
    }
}
class cycle extends Vehicle{
}
