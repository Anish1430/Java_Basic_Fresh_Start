import java.util.Scanner;

public class isAdult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age > 18) {
            System.out.println("isAdult");
        }else {
            System.out.println("Not Adult");
        }
    }
}
