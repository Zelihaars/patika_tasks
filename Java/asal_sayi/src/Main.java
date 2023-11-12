import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num,sum=0;

        for (int i=1;i <= 100;i++)
        {
            sum=0;
            for (int j=1 ; j<=i ;j++)
            {
                num = i % j;

                if(num == 0){
                    sum += j;
                }
            }

            if ((i+1) == sum){
                System.out.print(i+" ");
            }
        }
    }
}