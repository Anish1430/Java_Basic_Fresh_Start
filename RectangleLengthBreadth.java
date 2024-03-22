import java.util.Scanner;

public class RectangleLengthBreadth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Length of a rectangle");
          float length =sc.nextFloat();
        System.out.println("Enter the Breadth of a rectangle");
          float breadth=sc.nextFloat();
          float area=length * breadth;   //find the Area....
          float perimeter= 2 * (length * breadth);   //Find the Perimeter
        System.out.println("Area of Rectangle : "+ area);
        System.out.println("Perimeter of Rectangle : "+ perimeter);
           if(area > perimeter) {
               System.out.println("Area of rectangle is greater than  Perimeter");
           }else {
               System.out.println("Perimeter of rectangle is greater than Area");
           }
    }
}
