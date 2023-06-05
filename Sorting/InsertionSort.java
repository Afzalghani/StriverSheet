package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static int[] insertionSort(int arr[]){
       
        int n= arr.length;
        for(int i=0;i<n-1;i++){
           

            int j= i+1;

            while(j>0 && arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;

            
                

            }


        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        System.out.println(Arrays.toString(insertionSort(arr)));
        
    }

    
}