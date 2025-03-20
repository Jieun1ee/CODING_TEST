import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = {-1, -1};
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < gems.length; i++) {
            set.add(gems[i]);
        }
        
        HashMap<String, Integer> countGems = new HashMap<>();
        int l = 0, count = 0;
        int min = 100000;
        for (int r = 0; r < gems.length; r++) {
            countGems.put(gems[r], countGems.getOrDefault(gems[r], 0) + 1);
            if (countGems.get(gems[r]).equals(1)) {
                count++;
            }
            
            while (count == set.size()) {
                countGems.put(gems[l], countGems.get(gems[l]) - 1);
                
                if (countGems.get(gems[l]) <= 0) {
                    count--;
                    if (min > r - l + 1) {
                        min = r- l + 1;
                        answer[0] = l + 1;
                        answer[1] = r + 1;
                    }
                }
                l++;
            }
        }
        
        return answer;
    }
}