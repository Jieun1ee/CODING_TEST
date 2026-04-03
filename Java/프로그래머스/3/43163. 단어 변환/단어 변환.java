import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        queue.offer(begin);
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String now = queue.poll();
                
                if (now.equals(target)) {
                    return answer;
                }
                
                for (int j = 0; j < words.length; j++) {
                    if (!visited[j] && change(words[j], now)) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }
            answer++;
        }

        return 0;
    }
    
    private boolean change(String a, String b) {
        int cnt = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }
        
        return cnt == 1;
    }
}