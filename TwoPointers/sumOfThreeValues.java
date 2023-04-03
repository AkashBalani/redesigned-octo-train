package TwoPointers;

import java.util.Arrays;

public class sumOfThreeValues {
    public boolean findSumOfThree(int[] nums, int target){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum < target)
                    left++;
                else if(sum > target)
                    right--;
                else if(sum == target)
                    return true;
            }
        }
        return false;
    }
}

/*
 * 
 * Time Complexity:
 * Sorting the array: O(nlogn)
 * Nest loop to find the triplet: O(n^2)
 * Total: O(nlogn + n^2)
 * 
 * Space Complexity:
 * O(logn), in java the sorting algorithm takes O(logn) space.
 * 
 */
