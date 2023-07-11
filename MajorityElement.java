//Majority Elements on Leetcode: https://leetcode.com/problems/majority-element/description/
import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int res = solution(new int[]{3,2,3});
        System.out.println(res);
    }
    public static int solution(int[] nums){
        //sort
        // if an element is occurring more than n/2 times, it should be occupied a position in middle, return that element
     Arrays.sort(nums);
     return nums[nums.length/2];
    }
}
