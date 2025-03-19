import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            answer.add(numbers[i] + numbers[j]);
            j--;
            if (i == j) {
                i++;
                j = numbers.length - 1;
            } 
        }
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}