import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            heights.add(sc.nextInt());
            sc.nextLine();
        }

        int totalHeight = heights.stream().mapToInt(Integer::intValue).sum();

        int first = -1;
        int second = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalHeight - heights.get(i) - heights.get(j) == 100) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }

        heights.remove(first);
        heights.remove(second - 1);

        Collections.sort(heights);

        for (int i = 0; i < heights.size(); i++) {
            System.out.println(heights.get(i));
        }
    }
}