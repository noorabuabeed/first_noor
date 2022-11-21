import java.util.Scanner;

public class exercise2 {
    public static void main(String[]args){
        int x , y ,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter along of the sequence");
        x = scanner.nextInt();
        System.out.println("Enter a first number in the sequence");
        y = scanner.nextInt();
        System.out.println("Enter the imperfection between number");
        m = scanner.nextInt();
        for (int i=0 ; i<=x ; i++) {
            System.out.println(y);
            y = y + m;
        }
    }
}
