import java.util.Scanner;

import TwoPointers.reverseWordsInString;

public class main {
    public static void main(String[] args) {
        reverseWordsInString reverse = new reverseWordsInString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String str = scanner.nextLine();
        String rev = reverse.revWords(str);
        scanner.close();
        System.out.println(rev);
    }
}
