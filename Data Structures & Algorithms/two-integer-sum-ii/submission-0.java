class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high){
            System.out.println(numbers[low] + numbers[high]);
            if(numbers[low] + numbers[high] > target)
                high--;
            else if(numbers[low] + numbers[high] < target)
                low++;
            else if(numbers[low] + numbers[high] == target)
                return new int[]{low+1, high+1};
        }
        return new int[]{0,1};
    }
}
