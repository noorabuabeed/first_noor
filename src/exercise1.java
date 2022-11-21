import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the variables of the quadratic equation");
        System.out.println("a");
        a = scanner.nextDouble();
        System.out.println("b");
        b = scanner.nextDouble();
        System.out.println("C");
        c = scanner.nextDouble();
        if ((b * b) - (4 * a * c) < 0 || a == 0) {
            System.out.println("not solution");
        } else {
            x1 = (((-b) + (Math.sqrt((b * b) - (4 * a * c)))) / 2);
            x2 = (((-b) + (Math.sqrt((b * b) - (4 * a * c)))) / 2);
            if (x1 == x2) {
                System.out.println("we have a one solution \n x1" + x1);
            } else {
                System.out.println("we have a tow solution \n x1=" + x1 + "\tx2" + x2);
            }
        }
    }
}