package SecondClass;

import java.util.Scanner;

public class conditionProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount : ");
        int checkBalance=sc.nextInt();
        if (checkBalance<=50){
            System.out.println("Can not buy icecream");
        }
        else {
            System.out.println("can Buy icecream");
        }
    }
}
