package TwoPointers;

public class validPalindrome{
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char leftElement = s.charAt(left);
            char rightElement = s.charAt(right);
            if(leftElement != rightElement)
                return false;
            left = left + 1;
            right = right - 1;
        }
        return true;
    }
}

// Time Complexity:
// O(n) where n is the number of characters present in the string.

// Space Complexity:
// O(1) because we use constant space to store two indices.