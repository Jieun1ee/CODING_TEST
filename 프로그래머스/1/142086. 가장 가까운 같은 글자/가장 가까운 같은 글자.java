class Solution {
    public int[] solution(String s) {
                int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                answer[i] = -1;
            }

            if (i != 0) {
                int num = s.substring(0, i).lastIndexOf(s.charAt(i));
                if (num == -1) {
                    answer[i] = -1;
                }

                if (num != -1){
                    answer[i] = i - num;
                }
            }
        }
        return answer;
    }
}