package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortColor {
    public static void swap(int nums[],int low,int high)
{
    int temp=nums[low];
    nums[low]=nums[high];
    nums[high]=temp;
}
public static  void sortColors(int[] nums) {
    int low=0, mid=0, high=nums.length-1;
    while(mid<=high)
    {
       if(nums[mid]==0)
       {
           swap(nums,mid,low);
           low++;
           mid++;
       }
      else if(nums[mid]==1)
            mid++;
      else{
          swap(nums,mid,high);
          high--;
      }
    }
    
}

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}