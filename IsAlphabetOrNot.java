import java.util.Scanner;

//Write a program to check whether a character is alphabet or not
public class IsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          char ch=sc.next().charAt(0);
          if(ch >='a' && ch <='z' || ch >='A' && ch <='Z'){
              System.out.println("This Character is Alphabet"+" "+ch);
          }else {
              System.out.println("This is Not a Character"+" "+ch);
          }
    }
}
