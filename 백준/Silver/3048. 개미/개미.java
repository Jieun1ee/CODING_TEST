import java.io.*;
import java.util.*;

public class Main {

    static class Ant {
        String name;
        int num;

        public Ant(String name, int num) {
            this.name = name;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        Ant[] firstAnts = new Ant[n1 + 1];
        Ant[] secondAnts = new Ant[n2 + 1];

        String[] first = br.readLine().split("");
        String[] second = br.readLine().split("");

        for (int i = n1 - 1; i >= 0; i--) {
            firstAnts[n1 - i - 1] = new Ant(first[i], 1);
        }

        for (int i = 0; i < n2; i++) {
            secondAnts[i] = new Ant(second[i], -1);
        }

        int t = Integer.parseInt(br.readLine());

        Ant[] ants = new Ant[n1 + n2];
        for (int i = 0; i < n1; i++) {
            ants[i] = firstAnts[i];
        }

        for (int i = n1; i < n1 + n2; i++) {
            ants[i] = secondAnts[i - n1];
        }

        for (int i = 0; i < t; i++) {
            Ant[] temp = ants.clone();
            for (int j = 0; j < n1 + n2 - 1; j++) {
                if (temp[j].num == 1 && temp[j + 1].num == -1) {
                    Ant tmp = temp[j];
                    ants[j] = temp[j + 1];
                    ants[j + 1] = tmp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n1 + n2; i++) {
            sb.append(ants[i].name);
        }
        System.out.println(sb);
    }
}
