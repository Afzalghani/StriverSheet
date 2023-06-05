package recursion;

import java.util.Scanner;

public class print {

    public static  void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        print(n-1);
        
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
        
    }

    
}