import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        Queue<Integer> queueMin = new PriorityQueue<>();
        Queue<Integer> queueMax = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] split = operation.split(" ");
            if (Objects.equals(split[0], "I")) {
                queueMin.add(Integer.parseInt(split[1]));
                queueMax.add(Integer.parseInt(split[1]));
            }
            else if (Objects.equals(split[0], "D") && !queueMin.isEmpty()) {
                if (split[1].equals("-1")) {
                    int min = queueMin.peek();
                    queueMin.remove(min);
                    queueMax.remove(min);
                }
                else if (split[1].equals("1")) {
                    int max = queueMax.peek();
                    queueMax.remove(max);
                    queueMin.remove(max);
                }
            }
        }

        if (!queueMax.isEmpty()){
            answer[0] = queueMax.peek();
            answer[1] = queueMin.peek();
        }
        
        return answer;
    }
}