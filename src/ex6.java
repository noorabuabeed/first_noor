import java.util.Scanner;

public class ex6 {
    public static void main(String[]args){
        int num , sum = 0 ,x = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        while (num>0){
            x = num % 10;
            sum = sum + x;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
