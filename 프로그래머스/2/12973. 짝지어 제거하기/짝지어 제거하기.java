import java.util.*;

public class Solution {
    public static int solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
          if (!st.isEmpty() && st.peek() == c) {
              st.pop();
          } else {
              st.push(c);
          }
        }
        
        return st.isEmpty() ? 1 : 0;
    }
}