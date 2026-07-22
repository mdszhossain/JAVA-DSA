public class C_Insertion_Sort {
    public static void insertionSort(int nums[]) {
        int n = nums.length;
        for(int i = 1; i <= n-1; i++) {
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
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
        insertionSort(nums);
    }
}
