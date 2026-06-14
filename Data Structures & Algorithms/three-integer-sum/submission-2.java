class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0;i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1])
            continue;

            int low = i + 1;
            int high = nums.length - 1;

            while(low < high){
                if(nums[low] + nums[high] > 0 - nums[i])
                high--;

                else if(nums[low] + nums[high] < 0 - nums[i])
                low++;

                else if(nums[low] + nums[high] == 0 - nums[i]){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    
                    low++;
                    high--;
                    
                    while(low < high && nums[low] == nums[low - 1])
                    low++;

                    while(low < high && nums[high] == nums[high + 1])
                    high--;
                }
            }
        }
        return res;
    }
}
        
        // Arrays.sort(nums);
        // List<List<Integer>> res = new ArrayList<List<Integer>>();


        // for(int i = 0; i < nums.length; i++){
        //     if(i > 0 && nums[i] == nums[i-1])
        //     continue;

        //     int low = i + 1;
        //     int high = nums.length - 1;

        //     while(low < high){

        //         if(nums[low] + nums[high] > 0 - nums[i])
        //             high--;
        //         else if(nums[low] + nums[high] < 0 - nums[i])
        //             low++;
        //         else if (nums[low] + nums[high] == 0 - nums[i]){

        //             res.add(Arrays.asList(nums[i], nums[low], nums[high]));

        //             low++;
        //             while(low<high && nums[low]==nums[low-1])
        //             low++;

        //             high--;
        //             while(low < high && nums[high] == nums[high+1])
        //             high--;
        //         }
                
        //     }
        // }
        // return res;
//     }
// }
