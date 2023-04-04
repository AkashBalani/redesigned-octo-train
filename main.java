import java.util.Scanner;

import TwoPointers.reverseWordsInStringV2;

public class main {
    public static void main(String[] args) {
        reverseWordsInStringV2 reverse = new reverseWordsInStringV2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String str = scanner.nextLine();
        String rev = reverse.reverseWords(str);
        scanner.close();
        System.out.println(rev);
    }
}
