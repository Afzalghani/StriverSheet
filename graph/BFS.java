import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {

    public void bfs(ArrayList<ArrayList<Integer>> adj, int source , boolean visited[]){
    Queue<Integer> q = new ArrayDeque<Integer>();
    q.add(source);

    visited[source]= true;


    System.out.println(source+" ");

    while(!q.isEmpty()){
        int x = q.poll();
        for(int curr : adj.get(x)){

            if(!visited[curr]){
                q.add(curr);

                System.out.println(curr);
            }
    
        }

        
    }

   


}

public static void main(String[] args) {
    
}

    
}