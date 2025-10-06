class Solution {
    public int solution(int n) {
        String decToTrit = Integer.toString(n, 3);
        String reversed = new StringBuilder(decToTrit).reverse().toString();
        int answer = Integer.parseInt(reversed, 3);
        return answer;
    }
}