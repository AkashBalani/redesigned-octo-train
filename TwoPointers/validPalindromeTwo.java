package TwoPointers;

public class validPalindromeTwo {
    public boolean isPalindrome(String str){
        //StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = str.length() - 1;
        int count = 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end) && count == 0)
                return false;
            else if(str.charAt(start) != str.charAt(end) && count == 1){
                if(str.charAt(start + 1) == str.charAt(end))
                    end++;
                else if(str.charAt(start) == str.charAt(end - 1))
                    start--;
                else
                    return false;
                count--;
            }
            start++;
            end--;
        }
        return true;
    }
}
