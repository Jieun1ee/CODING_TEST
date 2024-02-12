class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        for (String t : arr) {
            if (t.length() == 0) {
                answer += " ";
            } else {
                answer += t.substring(0, 1).toUpperCase();
                answer += t.substring(1, t.length()).toLowerCase();
                answer += " ";
            }
        }
        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        
        return answer.substring(0, answer.length() - 1);
    }
}