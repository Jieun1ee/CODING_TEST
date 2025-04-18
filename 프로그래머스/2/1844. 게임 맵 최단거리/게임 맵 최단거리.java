import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        // if (maps[n-2][m-1] == 0 && maps[n-1][m-2] == 0) {
        //     return -1;
        // }
                
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int y = now[0];
            int x = now[1];

            for (int[] d : dir) {
                int ny = y + d[0];
                int nx = x + d[1];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                    if (maps[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        maps[ny][nx] = maps[y][x] + 1;
                        queue.offer(new int[]{ny, nx});
                    }
                }
            }
        }

        return maps[n - 1][m - 1] == 1 ? -1 : maps[n - 1][m - 1];
    }
}