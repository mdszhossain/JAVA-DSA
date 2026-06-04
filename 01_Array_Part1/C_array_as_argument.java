public class C_array_as_argument {
    public static void update(int marks[], int nonChangable) {
        for(int i = 0; i < marks.length; i++) {
            // here we changing each index value by 1
            marks[i] = marks[i] + 1;
        }
        // changing the value of nonChangable inside function
        nonChangable = nonChangable + 1;
    }
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable);

        // here main function have also updated values of marks
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // here in main function, value of nonChangable not changed. It remains same.
        System.out.println("value of nonChangable: " + nonChangable);
    }
}