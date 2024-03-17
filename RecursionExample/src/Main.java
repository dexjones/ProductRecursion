import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int product(int[] nums, int key) {
        if (key == 0) { // base case
            return nums[key];
        }
        return nums[key] * product(nums, key - 1); // multiplies current number by result of next call
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int key = 5;
        int[] nums = new int[key];

        System.out.println("Product Calculator Using Recursion");
        System.out.println("-----------------------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        result = product(nums, key - 1); // key needs to be subtracted by 1 to ensure staying in bounds of method
        System.out.println("The product of all numbers is: " + result);
    }
}