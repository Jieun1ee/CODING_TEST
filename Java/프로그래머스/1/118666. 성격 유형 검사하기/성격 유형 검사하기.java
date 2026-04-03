import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Character[] category = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}; 
        HashMap<Character, Integer> grade = new HashMap<>();
        
        for (int i = 0; i < category.length; i++) {
            grade.put(category[i], 0);
        }
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) {
                grade.put(survey[i].charAt(0), grade.get(survey[i].charAt(0)) + 4 - choices[i]);
            } else if (choices[i] > 4) {
                grade.put(survey[i].charAt(1), grade.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }
        
        String answer = "";
        
        if (grade.get('R') >= grade.get('T')) {
            answer += "R";
        } else {
            answer += "T";
        }
        
        if (grade.get('C') >= grade.get('F')) {
            answer += "C";
        } else {
            answer += "F";
        }
        
        if (grade.get('J') >= grade.get('M')) {
            answer += "J";
        } else {
            answer += "M";
        }
                
        if (grade.get('A') >= grade.get('N')) {
            answer += "A";
        } else {
            answer += "N";
        }
        
        return answer;
    }
}