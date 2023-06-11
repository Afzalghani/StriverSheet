
import java.util.*;


public class dfs {

    public void DFS(int source, ArrayList<ArrayList<Integer>> adj, boolean visited[]){

        visited[source] =true;
   
        System.out.println(source +" ");

        for(int curr : adj.get(source)){
            if(!visited[curr]){
                DFS(curr, adj, visited);
            }
        }
        

    
   
   
   }

    public static void main(String[] args) {
        
    }

    
}