import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 0;
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        answer = 45 - sum;
        return answer;
    }
}