class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        for (int i = 0; i < schedules.length; i++) {
            int time = schedules[i] + 10;
            if (time % 100 >= 60) {
                int q = time / 100;
                int r = time % 100;
                
                q++;
                r = r - 60;
                time = q * 100 + r;
            }
            for (int j = 0; j < 7; j++) {
                if ((j + startday) % 7 == 6 || (j + startday) % 7 == 0) {
                    continue;
                } else if (time < timelogs[i][j]) {
                    n--;
                    j = 7;
                }
            }
        }
        
        return n;
    }
}