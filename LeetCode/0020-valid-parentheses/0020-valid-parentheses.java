class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();

        String[] strs = s.split("");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("(") || strs[i].equals("{") || strs[i].equals("[")) {
                st.push(strs[i]);
            } else {
                if (st.isEmpty()) return false;

                String top = st.peek();
                if ((strs[i].equals(")") && top.equals("(")) ||
                    (strs[i].equals("}") && top.equals("{")) ||
                    (strs[i].equals("]") && top.equals("["))) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}