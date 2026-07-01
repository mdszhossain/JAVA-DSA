public class B_Max_Subarr_Sum_Prefix {
    public static int maxSubarrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // prefix array creation
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                int currSum = 0;
                if(start == 0) {
                    currSum = prefix[start];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int maxSum = maxSubarrSum(arr);

        System.out.println(maxSum);
    }
}
