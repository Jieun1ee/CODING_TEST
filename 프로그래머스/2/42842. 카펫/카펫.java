class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= yellow; i++) {
            int w, h;
            if (yellow % i != 0) {
                continue;
            } else {
                w = yellow / i;
                h = i;
            }
            
            int total = (w + 2) * (h + 2);
            if (total - yellow == brown) {
                if ((w + 2) >= (h + 2)) {
                    answer[0] = w + 2;
                    answer[1] = h + 2;
                } else {
                    answer[0] = h + 2;
                    answer[1] = w + 2;
                }
                
                return answer;
            }
        }
        
        return answer;
    }
}