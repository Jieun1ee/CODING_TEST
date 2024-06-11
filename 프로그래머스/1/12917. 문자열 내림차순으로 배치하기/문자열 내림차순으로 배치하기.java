import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        Arrays.sort(str);
        
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
        } 
    
        
        return sb.toString();
    }
}