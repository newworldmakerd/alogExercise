package DayTest.括号生成;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        int left = 0;
        int right =0;
        List<String> rel = new ArrayList<>();
        backtracking(n,rel,left,right,"(");
        return rel;
    }
    void backtracking(int n,List<String> result,int left,int right,String str){
        if(right>left){
            return;
        }
        if (left == right && left == n){
            result.add(str);
            return;
        }
        if(left < n){
            backtracking(n,result,left+1,right,str+"(");

        }
        if(right<left){
            backtracking(n,result,left,right+1,str+")");
        }
    }
    public int removeElement(int[] nums, int val) {
        int slow=0,fast=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
