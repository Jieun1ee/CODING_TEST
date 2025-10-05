class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binArr1 = new String[n];
        String[] binArr2 = new String[n];
        
        for (int i = 0; i < n; i++) {
            String temp = Integer.toBinaryString(arr1[i]);
            while (temp.length() < n) {
                temp = "0" + temp;
            }
            binArr1[i] = temp;
        }
        
        for (int i = 0; i < n; i++) {
            String temp = Integer.toBinaryString(arr2[i]);
            while (temp.length() < n) {
                temp = "0" + temp;
            }
            binArr2[i] = temp;
        }
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if (binArr1[i].charAt(j) == '1' || binArr2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}