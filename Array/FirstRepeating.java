
package Array;

import java.util.Scanner;


/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 * 
 */

 //There are different ways to solve it but this is best one
 //Just take time to understand it
public class FirstRepeating {

    class Solution {
        public int findDuplicate(int[] nums) {
    
            for(int i=0;i<nums.length;i++){
                int index = Math.abs(nums[i]);
    
                if(nums[index-1]<0){
                    System.out.println("inside the less than condition "+nums[index-1]);
                    return Math.abs(index);
                }
                else{
                    nums[index-1]= -1*nums[index-1];
                }
            }
            return -1;
    
    
            
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[]= new int[n];
 
        for(int i=0;i<n;i++){
         arr[i]=input.nextInt()
        } 
    }
     

}