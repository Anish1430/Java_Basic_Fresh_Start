import java.util.Scanner;

//Calculate Total Electricity Bill in Java
public class CalculateTotalElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int unit= sc.nextInt();
        float amt,surcharge,bill_amt;
          if(unit > 50) {
              amt =unit * 0.05f;
          }else if(unit <=150) {
              amt =unit * 0.75f;
          }else if(unit <=250) {
              amt=unit * 1.20f;
          }else {
              amt=unit * 1.50f;
          }
              surcharge=unit * 0.2f;
              bill_amt = amt + surcharge;
        System.out.println("The bill Amount is"+ bill_amt);
    }
}
