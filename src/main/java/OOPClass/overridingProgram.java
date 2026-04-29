package OOPClass;

public class overridingProgram {
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.wheel();
    }
}

class VehicleOption{
    public void wheel(){
        System.out.println("car has 4 wheel");
    }
    public void sound(){
        System.out.println("car has sound");
    }
    public void Engine(){
        System.out.println("car has Engine");
    }
}
class MotorCycle extends VehicleOption{

    @Override
    public void wheel() {
        System.out.println("Motor cycle has 2 wheel");
    }
}
