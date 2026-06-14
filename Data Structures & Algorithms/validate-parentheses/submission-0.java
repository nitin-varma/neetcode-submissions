class Solution {
    public boolean isValid(String s) {
        boolean res = true;
        Stack<Character> st = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if ((ch == '}') || (ch == ']') || (ch == ')')) {
                if (st.isEmpty())
                    return false;

                int top = st.peek();
                if ((ch == '}' && top == '{') || (ch == ']' && top == '[') || (ch == ')' && top == '('))
                    st.pop();
                else
                    return false;
            }
        }
        if (!st.isEmpty())
            return false;
        return true;
    }
}
