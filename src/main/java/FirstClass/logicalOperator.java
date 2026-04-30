package FirstClass;

import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter age :");
        int value = sc.nextInt();
        boolean isAge = value <= 18;
        if (isAge) {
            System.out.println("You can not access the website");
        } else {
            System.out.println("You can access the website");
        }
    }
}
