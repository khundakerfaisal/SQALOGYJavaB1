package SecondClass;

import java.util.Scanner;

public class inputFromSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input firstName : ");
        String firstName=sc.nextLine();
        System.out.println("input lastName : ");
        String lastName=sc.nextLine();

        System.out.println("My name is :" +firstName+" "+lastName);

    }
}
