package question.question3;

import java.util.Scanner;

public class ReadArrayExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type array size:");
        int[] nums = new int[in.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Type " + (i + 1) + " index:");
            nums[i] = in.nextInt();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
