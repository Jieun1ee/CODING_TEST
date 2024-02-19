import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length / 2;

        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count += 1;
            } 
        }
        
        if (count >= N) {
            return N;
        } else {
            return count;
        }
    }
}