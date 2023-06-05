package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

   static  int[] bubbleSort(int arr[]){
    
        int n= arr.length;

        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[i]>arr[j]){
                   swap(arr, i, j);
                }
            }
        }


    
        return arr;
    
    }

   static void swap(int arr[], int i , int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

       System.out.println(Arrays.toString(bubbleSort(arr)));
        
    }

    
}
