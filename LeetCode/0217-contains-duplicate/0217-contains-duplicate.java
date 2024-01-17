import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> testSet = new HashSet<>();
        
        for(int num : nums) {
            if (!testSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}
