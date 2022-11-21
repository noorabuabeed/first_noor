import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  rows;
        do {
            System.out.println("Enter a odd number greater than 3");
            rows = scanner.nextInt();
        } while (rows < 3 || rows % 2 == 0);
        for (int i = 0; i <= rows/2; i++) {
            for (int j = rows /2 - i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <=2 * i + 1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = rows/2 + 1; i<=rows-1; i++){
            for (int j = 1; j<=i - rows/2; j++){
                System.out.print(" ");
            }
            for (int j = 2*rows - 2*i - 1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}









