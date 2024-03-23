import java.util.Scanner;

public class AverageOfaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
            int sum=0;
          for(int i=0;i<n;i++){
               int num =sc.nextInt();
               sum +=num;

          }
          System.out.println("Sum of N number is = "+ sum);
           int avg=sum/n;
        System.out.println("Average Of a Number is = " +avg);
    }
}
