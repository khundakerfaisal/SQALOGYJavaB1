package SecondClass;

import java.util.Scanner;

public class exceptionHandeling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("input number : ");
            int number = sc.nextInt();
            System.out.println("you input correct integer number" + number);
        } catch (Exception e) {
            System.out.println("You input decimal value.Please input int value !!");
        }


    }
}
