import java.util.Scanner;

public class SortedArrayInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        //Is ascending or not 
          boolean isAscending = true;
        for(int i=0;i<n-1;i++) {
            if(arr[i] > arr[i+1]) {
                isAscending=false;
            }
        }
        if(isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }

    }
}
