import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                String[] words = str.split(" ");
                if (words[0].contains("front")) {
                    deque.addFirst(Integer.parseInt(words[1]));
                } else {
                    deque.addLast(Integer.parseInt(words[1]));
                }
            } else if (str.contains("pop")) {
                String[] words = str.split(" ");
                if (deque.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                if (words[0].contains("front")) {
                    System.out.println(deque.removeFirst());;
                } else {
                    System.out.println(deque.removeLast());
                }
            } else if (str.equals("size")) {
                System.out.println(deque.size());
            } else if (str.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (str.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getFirst());
                }
            } else if (str.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.getLast());
                }
            }
        }
    }
}
