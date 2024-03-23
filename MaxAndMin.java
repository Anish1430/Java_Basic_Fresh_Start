import java.util.Scanner;

public class MaxAndMin {
//
//    public static int[] findMaxAndMin(int arr[],int n) {
//         int ans[]=new int[2];
//         int max=arr[0];
//         int min=arr[1];
//
//        for(int i=0;i<n;i++){
//            if(arr[i] > max) {
//                max=arr[i];
//            }if(arr[i] < min) {
//                min=arr[i];
//            }
//        }
//        ans[0]=max;
//        ans[1]=min;
//
//        return ans;
//    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//           int n= sc.nextInt();
//           int arr[]=new int[n];
//           for(int i=0;i<n;i++) {
//             arr[i]=sc.nextInt();
//         }
//            int[] maxMin=findMaxAndMin(arr,n);
//             int max=maxMin[0];
//             int min=maxMin[1];
//        System.out.println("Max Number is = "+max);
//        System.out.println("Min Number is = "+min);

    Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max=arr[i];
            }if(arr[i] < min) {
                min=arr[i];
            }
        }
        System.out.println("Max Number is = "+max);
        System.out.println("Min Number is = "+min);

            }
    }
