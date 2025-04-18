import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        
        for (int i = 1; i <= numbers.length(); i++) {
            dfs("", numbers, i, visited);
        }
        
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void dfs(String str, String numbers, int len, boolean[] visited) {
        if (str.length() == len) {
            set.add(Integer.parseInt(str));
            return;
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(str + numbers.charAt(i), numbers, len, visited);
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}