import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();

         if(num < 0) {
             num = (-1) * num;
             System.out.println("Absolute Number is :"+num);
         }else {
             System.out.println(num);
         }
    }
}
