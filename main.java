import java.util.Scanner;

import TwoPointers.reverseWordsInString;
import TwoPointers.sumOfThreeValues;

public class main {
    public static void main(String[] args) {
        reverseWordsInString reverse = new reverseWordsInString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String str = scanner.nextLine();
        String rev = reverse.rev(str);
        scanner.close();
        System.out.println(rev);
    }
}
