import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        
        if (arr.length > 2) {
            answer = new int[arr.length - 1];
        }
        if (arr.length == 1) {
            answer = new int[1];
        }
        
        int[] temp = arr.clone();
        
        
        Arrays.sort(temp);
        
        int min = temp[0];
        
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[j] = arr[i];
                j++;
            }
            
            if (answer.length == 1) {
                answer[j] = -1;
            }
        }
        
        return answer;
    }
}