import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> st = new Stack<>();
            String str = br.readLine();
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == '(') {
                    st.push('C');
                } else if (c == ')') {
                    if (st.empty()) {
                        System.out.println("NO");
                        count++;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if (st.empty() && count == 0) {
                System.out.println("YES");
            } else if (!st.empty() && count == 0) {
                System.out.println("NO");
            }
        }
    }
}
