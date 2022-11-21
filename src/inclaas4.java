import java.util.Random;
import java.util.Scanner;

public class inclaas4 {
    public static void number(String[] args, int num) {
        int x = 50;
        Random random = new Random();
        int[] arry = new int[num];
        for (int i = 0; i > 50; i++) {
            num = random.nextInt();
            if (x < num) {
                x = num;
            }
            System.out.println(x);
        }
    }
}