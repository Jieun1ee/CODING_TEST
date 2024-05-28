import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] input = new String[5][15];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] strs = st.nextToken().split("");
            for (int j = 0; j < strs.length; j++) {
                input[i][j] = strs[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j][i] != null) {
                    sb.append(input[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}