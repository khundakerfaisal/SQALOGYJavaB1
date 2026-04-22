package SecondClass;

import java.util.Random;

public class MathFunctionProgram {
    public static void main(String[] args) {
        int number = 9;
        int number2 =5;

        double marks=75.55;

        //Random number generate program
        Random rand=new Random();
        int generateNumber=rand.nextInt(999)+111;
        System.out.println("random value is :" +generateNumber);

        System.out.println("Square value is: " + Math.sqrt(number));
        System.out.println("Max value is : "+Math.max(number,number2));
        System.out.println("Min value is : "+Math.min(number,number2));
        System.out.println("Random value using math function : " +Math.round(Math.random()*1000));

        System.out.println("Round value is : " +Math.round(marks));

        System.out.println("Floor value is : " +Math.floor(marks));

        System.out.println("Ceil value is : " +Math.ceil(marks));





    }
}
