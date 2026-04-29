package OOPClass;

public class overloadingProgram {
    public void sumOfNumber(int a,int b){
        int sum=a+b;
        System.out.println(sum);

    }
    public void sumOfNumber(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);

    }
    public void sumOfNumber(int a,int b,int c,int d){
        int sum=a+b+c+d;
        System.out.println(sum);

    }

    public static void main(String[] args) {
      overloadingProgram overloadingProgram=new overloadingProgram();
      overloadingProgram.sumOfNumber(10,20,30);
    }

}
