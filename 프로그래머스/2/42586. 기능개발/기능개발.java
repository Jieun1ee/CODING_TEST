import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        List<Integer> days = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int rest = 100 - progresses[i];
            int day = 0;
            if (rest % speeds[i] == 0) {
                day = rest / speeds[i];
                days.add(day);
            } else {
                day = rest / speeds[i];
                days.add(day + 1);
            }
        }
        
        int count = 1;
        int max = days.get(0);
        for (int i = 1; i < progresses.length; i++) {
            if (max < days.get(i)) {
                answer.add(count);
                count = 1;
                max = days.get(i);
            } else {
                count++;
            }
        }
        
        answer.add(count);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}