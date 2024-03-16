import java.util.Scanner;

public class MaxBetween2Number {

    //  Write a program to find maximum between two numbers....
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
         int num2= sc.nextInt();

         if(num1 > num2) {
             System.out.println("A is maximum number");
         }else {
             System.out.println("B is Greater");
         }
    }
}
