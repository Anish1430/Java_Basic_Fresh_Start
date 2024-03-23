import java.util.Scanner;


//Write a Java program to display the cube of the given number up to an integer. (Only Cube
public class PowerOFCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=1;i<=n;i++) {

              System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
          }
    }
}
