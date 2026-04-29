package OOPClass;

public class EncapsulationProgram {
    String name="Razon";
    String mobileNumber="01215413121";

    public int getEmpAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private int nid;

    public int getNidNumber(){
        return nid;
    }

    public void setNidNumber(int nid){
        this.nid=nid;
    }

    private int salary;


}
class Employee{
    public static void main(String[] args) {
        EncapsulationProgram encapsulationProgram=new EncapsulationProgram();
        System.out.println(encapsulationProgram.name);
        System.out.println(encapsulationProgram.mobileNumber);
        encapsulationProgram.setAge(28);
        encapsulationProgram.setNidNumber(11544);
        System.out.println(encapsulationProgram.getEmpAge());
        System.out.println(encapsulationProgram.getNidNumber());

    }

}
