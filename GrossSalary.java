import java.util.Scanner;

//Calculate Employees Gross Salary in Java
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int basic_salary=sc.nextInt();
          float hra,da,gs;
          if(basic_salary < 1500) {
                hra =basic_salary * 0.1f;
                da=basic_salary * 0.90f;
          }else {
                 hra=500;
                 da=basic_salary * 0.98f;
          }
            gs=hra + basic_salary + da;
        System.out.println(gs);
    }
}
