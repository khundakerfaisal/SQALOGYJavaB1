package ThirdClass;

import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<String,Integer> Marks=new HashMap<>();
        Marks.put("A+",80);
        Marks.put("F",33);
        Marks.put("A-",70);
        Marks.put("c",60);
        System.out.println(Marks);
        System.out.println(Marks.get("A-"));
    }
}
