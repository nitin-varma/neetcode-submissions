class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        int res = high;

        while(low <= high){
            int speed = (low + high)/2;

            long totalTime = 0;
            for(int p: piles){
                totalTime += Math.ceil((double) p/speed);
            }
            if(totalTime <= h){
                res = speed;
                high = speed - 1;
            }
            else
                low = speed + 1;
        }
        return res;
        // int low = 1;
        // int high = Arrays.stream(piles).max().getAsInt();

        // int res = high;
        // while (low <= high){
        //     int speed = (low + high) / 2;

        //     long totalTime = 0;
        //     for(int p: piles)
        //         totalTime += Math.ceil((double) p / speed);
        //     if(totalTime <= h){
        //         res = speed;
        //         high = speed - 1;
        //     }
        //     else{
        //         low = speed + 1;
        //     }
        // }
        // return res;
    }
}
