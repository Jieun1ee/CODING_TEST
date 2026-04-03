class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, n, computers);
            }
        }
        return answer;
    }
    
    private void dfs(int idx, int n, int[][] computers) {
        visited[idx] = true;
        
        for (int i = 0; i < n; i++) {
            if (computers[idx][i] == 1 && !visited[i]) {
                dfs(i, n, computers);
            }
        }
    }
}