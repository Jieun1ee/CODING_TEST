import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        List<String> numStr = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            numStr.add(String.valueOf(numbers[i]));
        }
        
        numStr.sort((a, b) -> (b + a).compareTo(a + b));
        
        for(String str : numStr) {
            answer += str;
        }
        
        if (numStr.get(0).equals("0")) return "0";
        
        return answer;
    }
}