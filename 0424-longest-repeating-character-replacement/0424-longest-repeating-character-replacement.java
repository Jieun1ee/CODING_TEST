class Solution {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int[] count = new int[26];

         int l = 0, maxFreq = 0;;
         for (int r = 0; r < s.length(); r++) {
            int tmp = s.charAt(r) - 'A';
            count[tmp]++;
            maxFreq = Math.max(maxFreq, count[tmp]);
            
            while ((r - l + 1) - maxFreq > k) { 
                count[s.charAt(l) - 'A']--;
                l++;
            }

            answer = Math.max(answer, r - l + 1);
        }

        return answer;
    }
}
