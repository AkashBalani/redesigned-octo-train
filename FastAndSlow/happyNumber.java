package FastAndSlow;

public class happyNumber {
    public int square(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, 2);
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int num){
        int slow = num;
        int fast = square(slow);
        while(slow != fast){
            slow = square(slow);
            fast = square(square(fast));
            if(fast == 1 || slow == 1)
                return true;
        }
        if(fast == 1 || slow == 1)
            return true;
        return false;
    }
}
