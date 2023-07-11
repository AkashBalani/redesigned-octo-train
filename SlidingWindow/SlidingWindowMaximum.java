package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * SlidingWindowMaximum
 */
public class SlidingWindowMaximum {

    public int[] findMaxSlidingWindow(int[] nums, int w){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(w, Comparator.reverseOrder());
        List<Integer> helperList = new ArrayList<>();
        int max = 0;
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
}