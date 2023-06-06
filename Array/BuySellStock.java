package Array;

import java.util.Scanner;

/**
 * BuySellStock
 */
public class BuySellStock {

    public static  int maxProfit(int[] prices) {


        int lsf = prices[0];
        int profit =0;

        for(int i=1;i<prices.length;i++){
            if(lsf>prices[i]){
               lsf = prices[i];
            }
            else{
                profit= Math.max(profit, prices[i]-lsf);
            }
        }
        return profit;
        
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        
    }

    
}