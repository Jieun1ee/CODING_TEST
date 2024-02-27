import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int a = A.length;
        int b = B.length;
        
        for (int i = 0; i < a; i++) {
            for (int j = b - 1; j >= 0; j--) {
                answer += A[i] * B[j];
                b--;
                break;
            }
        }

        return answer;
    }
}