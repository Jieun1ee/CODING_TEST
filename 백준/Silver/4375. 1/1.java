import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            long number = 1;
            long count = 1;
            while (true) {
                if (number % n == 0) {
                    System.out.println(count);
                    break;
                } else {
                    number = (number * 10) + 1;
                    number %= n;
                    count++;
                }
            }
        }
    }
}
