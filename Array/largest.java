package Array;

import java.util.Scanner;

public class largest {


    public  static int  largestNumber(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
  

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();

        }

        System.out.println(largestNumber(arr));
    }
    
}
