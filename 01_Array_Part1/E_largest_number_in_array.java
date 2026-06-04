public class E_largest_number_in_array {
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
            if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest Number in Array: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5};
        int largest = getLargest(nums);
        System.out.println("Largest Number in Array: " + largest);
    }
}
