package BitManupulation;

import java.util.Scanner;

/**
 Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

 

Example 1:

Input: a = 2, b = 6, c = 5
Output: 3
Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
Example 2:

Input: a = 4, b = 2, c = 7
Output: 1
Example 3:

Input: a = 1, b = 2, c = 3
Output: 0
 

Constraints:

1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9
 */
public class MinimumFlip {


    // Logic is quite simple check each element one by one and then 
    //Check each of them 
    public static int minFlips(int a, int b, int c) {

        
   
        int ans=0;

        while(a>0 || b>0 || c>0){
            
               int firstBit = (a&1)>0 ? 1:0;
               int lastBit = (b&1)>0 ? 1:0;
               int thirdBit = (c&1)>0? 1:0;

               if(thirdBit==0){
                   ans += (firstBit+lastBit);
               }
               else{
                   if(firstBit==0 && lastBit==0)
                            ans+= 1;
               }
               a= a>>1;
               b= b>>1;
               c= c>>1;
           

            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b= input.nextInt();
            int c = input.nextInt();

            System.out.println(minFlips(a, b, c));


        }

    
}