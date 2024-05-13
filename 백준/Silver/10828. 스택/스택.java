import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                String[] pushStr = str.split(" ");
                st.push(Integer.parseInt(pushStr[1]));
            } else if (str.equals("pop")) {
                if (st.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(st.pop());
                }
            } else if (str.equals("size")) {
                System.out.println(st.size());
            } else if (str.equals("empty")) {
                if (st.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (str.equals("top")) {
                if (st.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}