class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0)
        return 0;

        int res = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int l = 0, r = 0;

        for(int i = 0 ; i < n; i++){
            l = Math.max(height[i], l);
            leftMax[i] = l;
        }

        for(int i = n - 1; i >=0; i--){
            r = Math.max(height[i], r);
            rightMax[i] = r;
        }

        for(int i = 0; i < n; i++)
            res += Math.min(leftMax[i], rightMax[i]) - height[i];

        return res;
        // int n = height.length;
        // if(n == 0)
        // return 0;

        // int[] leftMax = new int[n];
        // int[] rightMax = new int[n];
        // int lMax = 0, rMax = 0;
        // for(int i = 0; i < n; i++){
        //     lMax = Math.max(height[i], lMax);
        //     leftMax[i] = lMax;
        //     rMax = Math.max(height[n - i - 1], rMax);
        //     rightMax[n - i - 1] = rMax;
        // }
        // int water = 0;
        // for(int i = 0;i < n; i++)
        //     water += Math.min(leftMax[i], rightMax[i]) - height[i];
            
        // return water;
    } 
}
