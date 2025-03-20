import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int l = 10, r = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                l = num;
            } else if (num == 3 || num == 6 || num == 9) { 
                sb.append("R");
                r = num;
            } else {
                if (num == 0) num = 11;

                int leftDist = Math.abs(l - num) / 3 + Math.abs(l - num) % 3;
                int rightDist = Math.abs(r - num) / 3 + Math.abs(r - num) % 3;

                if (leftDist < rightDist) {
                    sb.append("L");
                    l = num;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    r = num;
                } else { 
                    if (hand.equals("right")) {
                        sb.append("R");
                        r = num;
                    } else {
                        sb.append("L");
                        l = num;
                    }
                }
            }
        }
        return sb.toString();
    }
}
