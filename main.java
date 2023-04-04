import java.util.Scanner;

import TwoPointers.validPalindromeTwo;

public class main {
    public static void main(String[] args) {
        validPalindromeTwo palindromeTwo = new validPalindromeTwo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check if palindrome");
        String str = scanner.nextLine();
        boolean result = palindromeTwo.isPalindrome(str);
        scanner.close();
        System.out.println(result);
    }
}
