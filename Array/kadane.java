package Array;

import java.util.Arrays;
import java.util.Scanner;


public class kadane {
    //create a function which calcualte the subarray sum
    //There are different form of the kadane algorithm
    public   int maxSubArray(int[] nums) {

        //Initally we assign the value to both currSum and maxSum as the first sum because 
        //If assign it as zero then it will not work for negative number.
        int currSum=nums[0];
        int maxSum=nums[0];
       
        //Tarverse the entire array 
        for(int i=1;i<nums.length;i++){

            // Is it benefial to add the current element in the currSum or just take the current 
            //Element from the array

            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
            
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        System.out.println((maxSubArray(arr)));
    }
    
}
