package ThirdClass;

public class stringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Rashed");
        sb.append("Khan");
        sb.append("Ahmed");
        sb.delete(6,10);
        sb.reverse();
        System.out.println(sb);
    }
}
