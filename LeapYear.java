import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Write a program to check whether a year is leap year or not

        Scanner sc=new Scanner(System.in);
        int years=sc.nextInt();
        if(years % 4 == 0) {
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is Not Leap Year");
        }
    }
}
