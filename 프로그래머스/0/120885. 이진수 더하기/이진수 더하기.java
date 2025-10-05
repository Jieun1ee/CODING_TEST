class Solution {
    public String solution(String bin1, String bin2) {
        int binToDec1 = Integer.parseInt(bin1, 2);
        int binToDec2 = Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(binToDec1 + binToDec2);
    }
}