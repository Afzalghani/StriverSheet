package recursion;



public class sum {

    //These problem looks simple but for the concept building they are really great

    //Create the call stack for the recursion and you will find the answer

    public static  int Sum(int n){
        if(n==1)
          return 1;

    return n + Sum(n-1);
    }

    public static void main(String[] args) {
        
    }

    
}