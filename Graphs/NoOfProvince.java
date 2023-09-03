class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int set = 0;
        for(int i=0;i<isConnected.length;i++){
            // if(!visited[i]){
            //     for(int j=i;j<isConnected.length;j++){
            //         if(isConnected[i][j] == 1 || isConnected[j][i] == 1) visited[j] = true;
            //     }
            //     set++;
            // }

            if(!visited[i]){
                dfs(i, isConnected, visited);
                set++;
            }
        }
        return set;
    }

    public void dfs(int start,int[][] isConnected, boolean visited[]){
        if(visited[start]) return;
        visited[start] = true;
        for(int i=0;i<isConnected[0].length; i++){
            if(isConnected[start][i] == 1){
                dfs(i, isConnected,visited);
            }
        }
    }
}