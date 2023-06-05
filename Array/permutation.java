package Array;

import java.util.Arrays;
import java.util.Scanner;

public class permutation {
    public static void nextPermutation(int[] nums) {

        int index1 = -1;
    
       if(nums.length==1)
           return;
        int n= nums.length;

        for(int i= n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1= i;
                break;
            }
        }

        if(index1<0){
            reverse(nums);
         
           
        }else{

            int index2=0;
        for(int i= n-1;i>=0;i--){
            if(nums[i]>nums[index1]){
                index2=i;
                break;

            }
        }
        swap(nums,index1,index2);

        Arrays.sort(nums,index1+1,nums.length);
        }
        
        
    }
    public static  void swap(int[]nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    
     public static  void reverse(int nums[]){
        int low =0;
        int high = nums.length-1;
        while(low< high){
            swap(nums, low,high);
            low++;
            high--;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    
}