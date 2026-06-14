class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        HashSet<String> hs = new HashSet<>(Arrays.asList("+", "-", "/", "*"));
        for(String s: tokens){
            if(!hs.contains(s)){
                st.push(Integer.parseInt(s));
            }
            else{
                int b = st.pop();
                int a = st.pop();
                int c = 0;
                if(s.equals("+"))
                    c = a+b;
                else if(s.equals("-"))
                    c = a-b;
                else if(s.equals("*"))
                    c = a*b;
                else if(s.equals("/"))
                    c = a/b;
                st.push(c);
            }
        }
        return st.peek();
    }
}
