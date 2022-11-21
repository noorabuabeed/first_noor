import java.util.Scanner;

public class noor21 {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n , m = 0 ;
        System.out.println("Enter anumber");
        n = scanner.nextInt();
        for (int r= 0 ; r< n ;r++){
          for (int i = 2 ; i<n ; i++) {
              boolean flag = true;
              for (int j = 2; j < i; j++) {

                  if (i % j == 0) {
                      flag = false;
                      break;
                  }
              }
              if (flag) {
                  System.out.println(i);
              }
              }
          }
        }
    }

