class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> arrS = new HashMap<>();
        HashMap<Character, Integer> arrT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            arrS.put(s.charAt(i), arrS.getOrDefault(s.charAt(i), 0) + 1);
            arrT.put(t.charAt(i), arrT.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        return arrS.equals(arrT);
    }
}
