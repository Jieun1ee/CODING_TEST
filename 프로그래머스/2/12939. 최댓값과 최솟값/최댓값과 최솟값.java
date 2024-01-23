import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Integer> nums = new ArrayList<>();
        String[] splitS = s.split(" ");
        
        for (int i = 0; i < splitS.length; i++) {
            nums.add(Integer.parseInt(splitS[i]));
        }

        int max = nums.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = nums.stream().mapToInt(Integer::intValue).min().orElseThrow();
        
        answer = min + " " + max;
        return answer;
    }
}