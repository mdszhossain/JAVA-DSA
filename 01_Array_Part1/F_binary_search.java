public class F_binary_search {
    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid] < key) {
                start = mid + 1;
            } else if(nums[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;
        int index = binarySearch(nums, key);
        if(index == -1) {
            System.out.println("Item Not Found!");
        } else {
            System.out.println("Item Found at Index: " + index);
        }
    }
}
