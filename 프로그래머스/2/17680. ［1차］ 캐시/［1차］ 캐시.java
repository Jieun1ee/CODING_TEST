import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {   
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        Deque<String> queue = new ArrayDeque<>();
        
        for (String city : cities){
            city = city.toLowerCase();
            if (queue.contains(city)) {
                answer += 1;
                queue.remove(city);
                queue.addLast(city);
            } else {
                answer += 5;
                if (queue.size() >= cacheSize) {
                    queue.pollFirst();
                }
                queue.addLast(city);
            }
        }
        return answer;
    }
}