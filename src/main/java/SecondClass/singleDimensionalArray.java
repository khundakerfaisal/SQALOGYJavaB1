package SecondClass;

import java.util.Arrays;

public class singleDimensionalArray {
    public static void main(String[] args) {
        int [] marks={70,75,85,90,50};
        Arrays.sort(marks);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
//        System.out.println(Arrays.toString(marks));
    }
}
