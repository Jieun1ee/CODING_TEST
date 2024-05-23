import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                while (!st.empty()) {
                    sb.append(st.pop());
                }
                while (str.charAt(i) != '>') {
                    sb.append(str.charAt(i++));
                }
                sb.append('>');
            } else if (str.charAt(i) == ' ') {
                while (!st.empty()) {
                    sb.append(st.pop());
                }
                sb.append(' ');
            } else {
                st.push(str.charAt(i));
            }
        }

        while (!st.empty()) {
            sb.append(st.pop());
        }

        System.out.println(sb);
    }
}
