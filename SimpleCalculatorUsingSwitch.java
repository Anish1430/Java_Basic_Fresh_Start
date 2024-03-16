import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number");
         int num1=sc.nextInt();

        System.out.println("Enter the Operator");
        char operator=sc.next().charAt(0);

        System.out.println("Enter the Second Number");
         int num2=sc.nextInt();

         double ans;

         switch(operator) {
             case '+' :
             ans =num1 + num2;
                 System.out.println(ans);
             break;

             case '-' :
                 ans=num1-num2;
                 System.out.println(ans);
                 break;

             case '*'  :
                 ans =num1*num2;
                 System.out.println(ans);
                 break;

             case '/' :
                 if(num2 !=0) {
                     ans =num1 / num2;
                     System.out.println(ans+" ");
                 }else {
                     System.out.println("Number is Divisible by zero is Not possible");
                 }
                 break;

             default:
                 System.out.println("Error code is invalid");
         }
    }
}
