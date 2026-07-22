public class F_Binary_Search_Rotated_Array {
    public static int binarySearchRotatedArray(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        // binary search
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        int result = binarySearchRotatedArray(nums, target);
        
        if(result < 0) {
            System.out.println("Item Not Found!");
        } else {
            System.out.println("Item Found at Index: " + result);
        }
    }
}
