import java.util.Scanner;

import TwoPointers.sumOfThreeValues;

public class main {
    public static void main(String[] args) {
        sumOfThreeValues sum = new sumOfThreeValues();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element of the array");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target to be searched");
        int target = scanner.nextInt();
        scanner.close();
        boolean result = sum.findSumOfThree(nums, target);
        System.out.println(result);
    }
}
