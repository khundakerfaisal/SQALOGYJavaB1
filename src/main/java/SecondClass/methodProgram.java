package SecondClass;

public class methodProgram {

//     static int amount(int a,int b){
//        return a*b;
//    }
    int amount(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        methodProgram m1=new methodProgram();
        int sumOfAmount=m1.amount(10,15);
        System.out.println(sumOfAmount);

    }
}
