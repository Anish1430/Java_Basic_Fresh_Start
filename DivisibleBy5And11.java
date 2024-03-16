import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        // Write a program to check whether a number is divisible by 5 and 11 or not
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num % 5 ==0 && num % 11 == 0){
            System.out.println("This Number is Divisible by 5 and 11");
        }else {
            System.out.println("This Number is Not Divisible by 5 and 11");
        }
    }
}
