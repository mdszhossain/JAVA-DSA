public class I_print_subarrays {
    public static int printSubarrays(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("( " + numbers[i] + " ) ");
            int start = i;
            for(int j = i + 1; j < numbers.length; j++) {
                int end = j;
                System.out.print("( ");
                for(int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.print(") ");
            }
            System.out.println();
        }
        System.out.println();
        int n = numbers.length;
        int total_subarrays = (n * (n + 1)) / 2;
        return total_subarrays;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int total_subarrays = printSubarrays(numbers);
        System.out.println("Total Subarrays: " + total_subarrays);
    }
}
