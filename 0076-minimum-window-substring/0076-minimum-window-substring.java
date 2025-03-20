class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.isEmpty() || s.isEmpty()) {
            return "";
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0, have = 0;
        int[] idx = {-1, -1};
        int min = 100000;
        for (int r = 0; r < s.length(); r++) {
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);

            if (countT.containsKey(s.charAt(r)) && window.get(s.charAt(r)).equals(countT.get(s.charAt(r)))) {
                have++;
            }

            while (have == countT.size()) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    idx[0] = l;
                    idx[1] = r;
                }

                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                
                if (countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < countT.get(s.charAt(l))) {
                    have--;
                }
                l++;
            }
        }

        if (idx[0] == -1) {
            return "";
        } else {
            return s.substring(idx[0], idx[1] + 1);
        }
    }
}
