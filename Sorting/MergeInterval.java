package Sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeInterval {
    
        public static  int[][] merge(int[][] intervals) {
    
           Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
    
           LinkedList<int[]> list= new LinkedList();
    
           for(int curr[]: intervals){
               if(list.isEmpty()){
                   list.add(curr);
               }
              else if(list.getLast()[1]>=curr[0]){
                  list.getLast()[1]=Math.max(list.getLast()[1],curr[1]);
              }
              else{
                  list.add(curr);
              }
           }
    
            return list.toArray(new int[list.size()][0]);
    
            
        }
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int n= input.nextInt();

            int arr[][]= new int[n][2];

            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]= input.nextInt();
                }
            }

            System.out.println(Arrays.toString(merge(arr)));
            
        }
    
    
}