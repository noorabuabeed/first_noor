import java.util.Random;
import java.util.Scanner;

public class inclaas5 {
   public static void ert(String[]args){
       Scanner scanner = new Scanner();
       int v ;
       v = scanner.nextInt();
       main();
    public static void main( String[]args){
            int x = 5, y, sum = 0;
            int[] arry = new int[5];
            Random random = new Random();
            for (int i = 0; i < arry.length; i++) {
                y = random.nextInt();
                arry[i] = y;
                if (i == x) {
                    sum++;
                }
                System.out.println(sum);


            }
        }

    }


}
