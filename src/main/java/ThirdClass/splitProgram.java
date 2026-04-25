package ThirdClass;

import java.util.Arrays;

public class splitProgram {
    public static void main(String[] args) {
        String name="Kuddus ahamed";
        String []  devideName=(name.split("\\s"));
//        System.out.println(Arrays.toString(devideName));
        String result = String.join(" ", devideName);
        System.out.println(result);
    }
}
