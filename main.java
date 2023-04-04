import java.util.Scanner;

import FastAndSlow.happyNumber;

public class main {
    public static void main(String[] args) {
        happyNumber number = new happyNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check if happy");
        int num = scanner.nextInt();
        boolean result = number.isHappy(num);
        scanner.close();
        System.out.println(result);
    }
}
