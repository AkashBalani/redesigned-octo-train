package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

/**
 * SlidingWindowMaximum
 */
public class SlidingWindowMaximum {

    public int[] findMaxSlidingWindow(int[] nums, int w){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(w, Comparator.reverseOrder());
        List<Integer> helperList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(queue.size() < w){
                queue.add(nums[i]);
                helperList.add(nums[i]);
            }
            else{
                max = queue.peek();
                list.add(max);
                queue.remove(helperList.get(0));
                helperList.remove(0);
                queue.add(nums[i]);
                helperList.add(nums[i]);
            }
            if(i == nums.length - 1){
                max = queue.peek();
                list.add(max);
            }
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }

    public Deque<Integer> clearUp(int i, Deque<Integer> currentWindow, int[] nums){
        while(currentWindow.size() != 0 && nums[i] >= nums[currentWindow.getLast()]){
            currentWindow.removeLast();
        }
        return currentWindow;
    }

    public int[] findMaxSlidingWindowV2(int[] nums, int w){
        if (nums.length == 0) {
            return new int[0];
        }
        // If input is empty return null
        
        if (w > nums.length) {
            w = nums.length;
        }
        // If the window size is greater than the array size, set window size = array size

        int[] output = new int[nums.length - w + 1];
        Deque<Integer> currentWindow = new ArrayDeque<>(); 

        for(int i = 0; i < w; i++){
            currentWindow = clearUp(i, currentWindow, nums);
            currentWindow.add(i);
        }
        output[0] = nums[currentWindow.getFirst()];

        for(int i = w; i < nums.length; i++){
            clearUp(i, currentWindow, nums);

            if(!currentWindow.isEmpty() && currentWindow.getFirst() <= (i - w)) {
                currentWindow.removeLast();
            }

            currentWindow.add(i);

            output[i - w + 1] = nums[currentWindow.getFirst()];
        }
        return output;
    }
}