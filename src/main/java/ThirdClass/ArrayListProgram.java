package ThirdClass;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("coconut");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("watermelon");
        fruits.add("strawberry");

        System.out.println("Find the value : " + fruits.get(3));
//        fruits.remove("coconut"); //Remove data from list
        System.out.println("Print all fruits " + fruits);
    }
}
