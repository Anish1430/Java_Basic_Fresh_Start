import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num= sc.nextInt();
        // Check the number is odd or not
         if(num % 2 ==0){
             System.out.println("The number is Even Number");
         }else {
             System.out.println("The number is Odd Number");
         }
    }
}
