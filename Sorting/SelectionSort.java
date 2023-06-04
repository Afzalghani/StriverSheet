package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    static int[] selectionSort(int[] arr){

        int n= arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }

            swap(arr,i,min);

        }
           
        return arr;
    }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n= input.nextInt();
    int arr[]= new int[n];

    for(int i=0;i<n;i++){
        arr[i]= input.nextInt();
    }

    System.out.println(Arrays.toString(selectionSort(arr)));

    
}
    
}