import javax.swing.*;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the long");
        x = scanner.nextInt();
        for (int num = 2; num <=x; num++) {
            boolean flag = true;
            for (int i = 2; i < num; ++i) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num );
            }

            }
        }

    }



