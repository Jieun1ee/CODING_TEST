import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> player = new HashMap<String, Integer>();

        for (String p : participant) {
            if (player.containsKey(p)) {
                player.put(p, player.get(p) + 1);
            } else {
                player.put(p, 1);
            }
        }
        
        for (String c : completion) {
            if (player.containsKey(c)) {
                player.put(c, player.get(c) - 1);
            }
        }

        for (String key : player.keySet()) {
            if (player.get(key) == 1) {
                answer = key;
            }
        }
        
        return answer;
    }
}