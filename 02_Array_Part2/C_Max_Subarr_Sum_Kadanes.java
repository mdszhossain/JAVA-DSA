public class C_Max_Subarr_Sum_Kadanes {
    public static int maxSubarrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubarrSum(arr);
        System.out.println(maxSum);
    }
}
