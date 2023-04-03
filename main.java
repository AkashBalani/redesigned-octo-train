
package TwoPointers;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        validPalindrome vp = new validPalindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if palindrome:");
        String str = scanner.nextLine();
        scanner.close();
        boolean result;
        result = vp.isPalindrome(str);
        System.out.println(result);
    }
}
