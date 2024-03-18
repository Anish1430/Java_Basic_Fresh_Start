import java.util.Scanner;


//Write a program to input any alphabet and check whether it is vowel or consonant
public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          char ch=sc.next().charAt(0);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
              System.out.println("This is a Vowel");
          }else {
              System.out.println("This is a constant");
          }
    }
}
