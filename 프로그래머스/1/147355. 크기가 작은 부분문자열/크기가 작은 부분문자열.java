class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        Long numP = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String num = t.substring(i, i + p.length());
            if (numP >= Long.parseLong(num)) {
                answer += 1;
            }
        }
        
        return answer;
    }
}