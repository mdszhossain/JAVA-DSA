public class G_reverse_array {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while(first < last) {
            // swap
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            // updation
            first++;
            last--;
        }
    }
    public static void printArray(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);
        printArray(numbers);
    }
}
