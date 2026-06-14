class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int num: nums)
        hs.add(num);

        int max = 0;
        for(int n: hs){
            if(!hs.contains(n - 1)){
                int length = 1;
                while(hs.contains(n + length))
                    length++;
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
