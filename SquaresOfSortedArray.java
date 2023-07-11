// Solved this on Leetcode: https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.*;
class Solution{
    public static void main(String[] args) {
        solution(new int[] {1,2,3,4,5});
    }
    public static int[] solution(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
