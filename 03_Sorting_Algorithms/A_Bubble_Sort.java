public class A_Bubble_Sort {
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i <= n-2; i++) {
            for(int j = 0; j <= n-2-i; j++) {
                if(nums[j] >= nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        printNums(nums);
    }

    public static void printNums(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        bubbleSort(nums);
    }
}
