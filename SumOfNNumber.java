import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int sum=0;
          for(int i=0;i<n;i++){
              int num=sc.nextInt();
              sum =sum + num;
          }
        System.out.println("The Sum of N Natural Number is = "+sum);

    }
}
