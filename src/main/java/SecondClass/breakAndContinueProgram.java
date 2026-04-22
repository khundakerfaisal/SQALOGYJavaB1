package SecondClass;

public class breakAndContinueProgram {
    public static void main(String[] args) {
        //Break
        for (int i=0;i<=5;i++){
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // continue
        for (int j=0;j<=5;j++){
            if (j == 4) {

                continue;
            }
            System.out.println(j);
        }

    }
}
