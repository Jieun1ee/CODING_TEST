import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        HashSet<Character> skipChar = new HashSet<>();
        
        for (int i = 0; i < skip.length(); i++) {
            skipChar.add(skip.charAt(i));
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            
            while (count < index) {
                c++;
                
                if (c > 'z') {
                    c = 'a';
                }
                
                if (!skipChar.contains(c)) {
                    count++;
                }
            }

            answer.append(c);
        }
 
        return answer.toString();
    }
}