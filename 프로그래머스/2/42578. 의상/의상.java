import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothe = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (clothe.containsKey(clothes[i][1])) {
                clothe.replace(clothes[i][1], clothe.get(clothes[i][1]) + 1); // 경우의 수에 1씩 추가
            } else {
                clothe.put(clothes[i][1], 2); // 있고 아예 없고의 경우의 수로 2
            }
        }

        int answer = 1;
        for (Entry<String, Integer> stringIntegerEntry : clothe.entrySet()) {
            answer *= stringIntegerEntry.getValue();
        }
        
        return answer - 1;
    }
}