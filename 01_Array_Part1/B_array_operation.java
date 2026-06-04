import java.util.*;
public class B_array_operation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];
        // input in array
        marks[0] = sc.nextInt(); // physics marks
        marks[1] = sc.nextInt(); // chemistry marks
        marks[2] = sc.nextInt(); // mathematics marks

        // output from array
        System.out.println("physics: " + marks[0]);
        System.out.println("chemistry: " + marks[1]);
        System.out.println("mathematics: " + marks[2]);

        // updation
        marks[2] = marks[2] + 2;
        System.out.println("updated mathematics marks:" + marks[2]);

        // percentage calculation
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");

        // array length calculation
        System.out.println("length of array: " + marks.length);

        sc.close();
    }
}