// Given an integer array nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}
// return true if any value appeares twice
// return false if each elelement is distinct
public class A_Assignment_Question_01 {
    // approach 1 - BruteForce
    public static boolean checkFrequency(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // approach 2 - Using helper array
    public static boolean frequencyCheck(int nums[]) {
        int n = nums.length;
        // findint maximum from array
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
        }

        // creating new array size of the maximum value + 1
        int auxArr[] = new int[maxVal + 1];

        // traversing main array and updating aux array
        for(int i = 0; i < n; i++) {
            auxArr[nums[i]]++;
        }

        // traversing aux array
        for(int i = 0; i < auxArr.length; i++) {
            if(auxArr[i] > 1) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        boolean result1 = checkFrequency(nums);
        System.out.println("Result 1 is: " + result1);

        boolean result2 = frequencyCheck(nums);
        System.out.println("Result 2 is: " + result2);
    }
}
