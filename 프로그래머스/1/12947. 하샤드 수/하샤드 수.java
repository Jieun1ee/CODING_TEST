class Solution {
    public boolean solution(int x) {
        int num = 0;
        int x1 = x;
        while (x1 >= 1) {
            num += x1 % 10;
            x1 /= 10;
        }
        
        if (x % num == 0) {
            return true;
        } else {
            return false;
        }
    }
}