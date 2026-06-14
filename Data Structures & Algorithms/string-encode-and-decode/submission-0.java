class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())
            return "";

        StringBuilder res = new StringBuilder();
        for(String st: strs){
            res.append(st.length() + "#" + st);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();

        int len = str.length();
        if(len == 0)
        return res;

        int i = 0;
        while(i < len){
            int j = i;
            while(str.charAt(j) != '#')
                j++;
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return res;
        
        // List<String> res = new ArrayList<String>();
        // int len = str.length();
        // if(len == 0) //empty string
        // return res;
        
        // int i = 0;
        // while(i < len){
        //     int j = i;
        //     while(str.charAt(j) != '#')
        //         j += 1;
        //     int length = Integer.parseInt(str.substring(i, j));
        //     res.add(str.substring(j + 1, j + 1 + length));
        //     i = j + 1 + length;
        // }
        // return res;
    }
}
