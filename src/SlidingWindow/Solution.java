package SlidingWindow;

import java.util.Map;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int cur = 0;
        int min = nums.length;
        for(int j = 0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1 == nums.length){
                if(sum<target){
                    return 0;
                }
            }
            while (sum >= target){
                cur = j - i + 1;
                sum -= nums[i];
                i++;
                min = Math.min(min,cur);
            }
        }
        return  min;
    }
}
