import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int w : works) {
            pq.add(w);
        }

        while (n > 0 && !pq.isEmpty()) {
            int max = pq.poll();
            if (max > 0) {
                pq.add(max - 1);
                n--;
            } else {
                break;
            }
        }

        long answer = 0;
        while (!pq.isEmpty()) {
            long work = pq.poll();
            answer += work * work;
        }

        return answer;
    }
}
