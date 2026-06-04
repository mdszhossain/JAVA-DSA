public class H_pairs_in_array {
    public static int pairs(int numbers[]) {
        int totalPairs = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            int current = numbers[i];
            for(int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + " " + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println();
        return totalPairs;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int totalPairs = pairs(numbers);
        System.out.println("Total Pairs: " + totalPairs);
    }
}
