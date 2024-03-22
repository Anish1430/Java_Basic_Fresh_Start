import java.util.Scanner;

public class HelpOfFunctionReturnSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
          printSum(a,b);
    }

    private static void printSum(int a, int b) {
         int sum=a+b;
        System.out.println(a+b);
          int bum=a-b;
        System.out.println(bum);
        int tum=a*b;
        System.out.println(tum);
        int skm=a / b;
        System.out.println(skm);
    }
}
