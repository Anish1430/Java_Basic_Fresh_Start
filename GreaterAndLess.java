import java.util.Scanner;

public class GreaterAndLess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a == b) {
            System.out.println("A is equal to B");
        }else if (a > b) {
            System.out.println("A is Greater");
        }else {
            System.out.println("A is lesser");
        }
    }
}
