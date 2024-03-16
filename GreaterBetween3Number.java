import java.util.Scanner;

public class GreaterBetween3Number {
    public static void main(String[] args) {

        // Write a program to find maximum between three numbers ...
        Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c= sc.nextInt();
          if( a > b && a > c ) {
              System.out.println("A is Greater");
          }else if(b > a && b > c) {
              System.out.println("B is Greater");
          }else if(a==b && b==c) {
              System.out.println("A B and C is Equal");
          }else {
              System.out.println("C is Greater");
          }
    }
}
