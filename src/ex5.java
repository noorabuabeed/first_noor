import java.util.Scanner;

public class ex5 {
    public static void main(String[]args){

        for (int i = 0; i>=-1 ;i++) {
            System.out.println(sec(i));

        }
    }
    public static int sec(int x) {
        if (x == 0) return 1;
        if (x == 1) return 2;

        else
            return sec(x - 1) + sec(x - 2);

        }
    }




