class Solution {
    public int[] solution(String s) {
        int i = 0, countZero = 0;

        while (!s.equals("1")) {
            String removed = s.replace("0", "");
            countZero += s.length() - removed.length();
            s = Integer.toBinaryString(removed.length());
            i++;
        }
        
        int[] answer = {i, countZero};
        return answer;
    }
}