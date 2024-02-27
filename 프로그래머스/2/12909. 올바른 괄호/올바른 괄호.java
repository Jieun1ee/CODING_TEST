import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(c);
            } if (c == ')') {
                if (st.size() == 0) {
                    answer = false;
                } 
                else st.pop();
            }
        }
                    
        if (st.size() != 0) {
            answer = false;
        }
        return answer;
    }
}