package FastAndSlow;

public class circularArray {
    public boolean circularArrayLoop(int[] nums){
        boolean direction = false;
        int slow = 0;
        int fast = 0;
        for (int i = 0; i < nums.length; i++) {
            if(Math.abs(nums[i]) == nums.length)
                continue;
            if(nums[i] >= 0){
                direction = true;
            }
            else
                direction = false;
            slow = i;
            fast = i;

            System.out.println("Slow Pointer = " + slow + " Fast Pointer = " + fast);
            System.out.println("Starting from value = " + nums[i]);

            while(slow != fast || slow != -1 || fast != -1){
                slow = nextStep(nums, slow, direction);
                if(slow == -1)
                    break;

                fast = nextStep(nums, fast, direction);

                if(fast != -1)
                    fast = nextStep(nums, fast, direction);
                if(fast == -1 || slow == fast)
                    break;
            }
            if(slow == fast && slow != -1)
                return true;
        }
        return false;
    }
    public int nextStep(int[] nums, int curr, boolean direction){
        boolean currdirection = false;
        int findStep;

        if(nums[curr] >= 0)
            direction = true;
        else
            direction = false;

        if(direction != currdirection || Math.abs(nums[curr] % nums.length) == 0)
            return -1;

        findStep = curr + nums[curr];
        findStep = findStep % nums.length;
        if(findStep < 0)
            findStep = findStep + nums.length;
        return findStep;
    }
}
