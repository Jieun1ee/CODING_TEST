import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] giftCount = new int[friends.length][friends.length];
        int[] giftIndex = new int[friends.length];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            int giverIdx = Arrays.asList(friends).indexOf(giver);
            int receiverIdx = Arrays.asList(friends).indexOf(receiver);

            giftCount[giverIdx][receiverIdx] += 1;
            giftIndex[giverIdx] += 1; 
            giftIndex[receiverIdx] -= 1; 
        }

        int maxGift = 0;
        
        for (int i = 0; i < friends.length; i++) {
            int giftCnt = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;
                
                if (giftCount[i][j] == giftCount[j][i]) {
                    if (giftIndex[i] > giftIndex[j]) {
                        giftCnt += 1;
                    }
                } else {
                    if (giftCount[i][j] > giftCount[j][i]) {
                        giftCnt += 1;
                    }
                }
            }
            maxGift = Math.max(maxGift, giftCnt);
        }
        
        return maxGift;
    }
}