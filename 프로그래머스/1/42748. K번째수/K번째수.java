import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int first = commands[i][0];
            int second = commands[i][1];
            int third = commands[i][2];

            int num = sort(array, first, second, third);
            answer[i] = num;
        }
        
        return answer;
    }

    private static int sort(int[] array, int first, int second, int third) {
        List<Integer> nums = new ArrayList<>();
        for (int i = first - 1; i <= second - 1; i++) {
            nums.add(array[i]);
        }
        Collections.sort(nums);

        return nums.get(third - 1);
    }
}