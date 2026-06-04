public class D_linear_search {
    public static int linearSearch(int nums[], int key) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(nums, key);

        if(index >= 0) {
            System.out.println("Item Found at Index: " + index);
        } else {
            System.out.println("Item Not Found!");
        }
    }
}