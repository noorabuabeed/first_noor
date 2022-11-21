import java.util.Random;
import java.util.Scanner;

public class inclaas3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x ;
        System.out.println("Enter a long");
        x = scanner.nextInt();
        for (int i =0 ; i<x ; i++){
            int c = random.nextInt();
            System.out.println(c);
        }
    }
}
