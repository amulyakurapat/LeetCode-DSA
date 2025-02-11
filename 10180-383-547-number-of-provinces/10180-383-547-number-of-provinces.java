public class Solution {  
       public void bfs(int[][] M , boolean[] visited, int i){
            Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    int current  = q.poll();
                    for(int neighbor = 0;neighbor < M.length; neighbor ++ ){
                        if(M[current][neighbor] == 1 && !visited[neighbor]){
                    q.add(neighbor);
                    visited[neighbor] = true;
                        }
                    }
                }
            
       }
    
      public int findCircleNum(int[][] M) {
      boolean[] visited = new boolean[M.length];
      int count = 0;
      for(int i = 0;i<M.length;i++){
       if(!visited[i]){
         visited[i] = true;
         bfs(M,visited,i);
         count++;
       }
        }
      
      return count;
    }
    
}
