package OOPClass;

public class AccessModifierProgram {
    public String name="Emon";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    protected int nid=12121;
    String mobileNumber="011542111154";


}

class AccessExample{
    public static void main(String[] args) {
        AccessModifierProgram accessModifierProgram=new AccessModifierProgram();
        System.out.println(accessModifierProgram.name);
        System.out.println(accessModifierProgram.mobileNumber);
        System.out.println(accessModifierProgram.nid);
        accessModifierProgram.setAge(25);
        System.out.println(accessModifierProgram.getAge());
    }

}
